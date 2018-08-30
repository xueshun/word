package cn.servy.pdf;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.aspectj.weaver.ast.Test;

import java.io.*;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/12 21:01</pre>
 * <pre>作者: xueshun</pre>
 */
public class JsonReader {

    public static void main(String[] args) {
        StringBuilder json = new StringBuilder();
        try {
            InputStream resourceAsStream = Test.class.getClassLoader().getResourceAsStream("seal.json");
            BufferedReader in = new BufferedReader(new InputStreamReader(resourceAsStream));
            String inputLine = null;
            while ((inputLine = in.readLine())!= null){
                json.append(inputLine);
            }
            in.close();
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("转换前："+json);

        System.out.println("------------------");

        Object parse = JSONObject.parse(json.toString());
        System.out.println(parse);

        JSONObject jsonObject = JSON.parseObject(json.toString());
        Object o = jsonObject.get("24401000000");
        System.out.println(o);

        JSONObject jsonObject1 = JSON.parseObject(o.toString());
        System.out.println(jsonObject1.get("sealId"));

    }
}
