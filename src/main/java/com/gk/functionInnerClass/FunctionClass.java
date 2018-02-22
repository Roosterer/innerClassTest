package com.gk.functionInnerClass;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class FunctionClass {

    public static String ps1 = "abc";
    public String ps2 = "def";

    FunctionClass(){
        System.out.println("function 的构造方法");
    }

    void fun(){

        String a = "this is a";
        System.out.println(a);

        class Temp{
            String b ="this is b";
            void tempFun(){
//                System.out.println(a);//如果方法类中要使用到方法中的变量a，a要声明为final，否则无法通过编译
                System.out.println(ps1);
                System.out.println(ps2);
            }

            @Override
            protected void finalize() throws Throwable {
                System.out.println("temp 回收");
            }

            Temp(){
                System.out.println("temp 的构造方法");
            }
        };
        Temp t = new Temp();
        t.tempFun();
    }


    public static void main(String[] args) {
        FunctionClass f = new FunctionClass();
        //方法执行完即销毁方法中的类
        f.fun();
    }


}
