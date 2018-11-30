package cn.study.concurrent.art.chapter04.connection;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * <pre>类名: ConnectionPool</pre>
 * <pre>描述: 连接池</pre>
 * <pre>日期: 2018/11/20 10:13</pre>
 * <pre>作者: xueshun</pre>
 */
public class ConnectionPool {
    private LinkedList<ConnectionPool> pool = new LinkedList<ConnectionPool>();

    /**
     * 初始化连接池大小
     * @param initialSize
     */
    public ConnectionPool(int initialSize) {
        if(initialSize > 0){
            for (int i = 0; i < initialSize; i++) {
                pool.add((ConnectionPool) ConnectionDriver.createConnection());
            }
        }
    }

    /**
     * 释放连接
     * @param connection
     */
    public void releaseConnection(Connection connection){
        if(connection != null){
            synchronized (pool){
                pool.addLast((ConnectionPool) connection);
                pool.notifyAll();
            }
        }
    }

    /**
     * 获取连接
     * @param mills
     * @return
     * @throws InterruptedException
     */
    public ConnectionPool fetchConnection(long mills) throws InterruptedException {
        synchronized (pool){
            if(mills <= 0){
               while(pool.isEmpty()){
                   pool.wait();
               }
               return pool.removeFirst();
            }else{
                long future = System.currentTimeMillis() + mills;
                long remaining = mills;
                while (pool.isEmpty() && remaining >0){
                    pool.wait(remaining);
                    remaining = future - System.currentTimeMillis();
                }

                Connection result = null;
                if(!pool.isEmpty()){
                    result = (Connection) pool.removeFirst();
                }
                return (ConnectionPool) result;
            }
        }
    }
}
