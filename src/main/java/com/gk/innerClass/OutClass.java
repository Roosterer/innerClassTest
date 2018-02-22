package com.gk.innerClass;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class OutClass {

    private String ps1 = "abc";
    private static String ps2 = "def";
    static {
        System.out.println("外部类静态块");
    }
    OutClass(){
        System.out.println("out 构造方法");
    }


    class InnerClass{
        //普通内部类不能有静态成员（变量，方法，静态块）
//        public static String a = "";

        {
            System.out.println("内部类代码块");
        }

        InnerClass(){
            System.out.println("inner 构造方法");
        }

        void fun(){
            System.out.println(ps1);
            System.out.println(ps2);
        }
    }

}
