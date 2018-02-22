package com.gk.staticInnerClass;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class OutClass {
    private String ps1 = "外部类私有变量";
    private static String ps2 = "外部类私有静态变量";
    public String ps3 = "外部类公有变量";
    public static String ps4 = "外部类公有静态变量";
    private static String ps5 = "this is out ps5";

    static {
        System.out.println("外部类静态块");
    }

    OutClass(){
        System.out.println("外部类默认构造方法");
    }
    private static void outFun(){

    }


     static class InnerClass{
        private String ps1 = "内部类私有变量";
        private static String ps2 = "内部类私有静态变量";
        public String ps3 = "内部类公有变量";
        public static String ps4 = "内部类公有静态变量";

        static {
            System.out.println("内部类静态块");
        }
        InnerClass(){
            System.out.println("内部类默认构造方法");
        }

        void fun(){
            //静态内部类可以使用外部类的静态成员和和静态方法，在内部类第一次使用到外部类静态成员时初始化外部类。
            //静态内部类不能使用外部类的普通成员
            ps5 = "fun change,now is ps5Inner";
            outFun();
            System.out.println(ps5);
        }
    }

}
