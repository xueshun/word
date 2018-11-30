package cn.study.concurrent.art.chapter04;

public class Demo {

    static final int shift = 16;
    static final int mask = (1<<16) -1;

    public static void main(String[] args) {
       printInfo(1 << 16);
       printInfo((1<<16) - 1);
       printInfo(10 & mask);
        System.out.println(mask);
    }


    private static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num));
    }
}
