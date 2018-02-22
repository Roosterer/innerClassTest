package com.gk.singleton;


/**
 * Created by gaokuo on 2018/2/22.
 */
public class NeiBuLei {

    //私有构造方法
    private NeiBuLei(){};

    //私有的内部类
    private static class InnerClass{
        private final static Object instance = new Object();
    }

    public static Object getInstance(){
        System.out.println("return instance");
        return InnerClass.instance;
    }

    public static void main(String[] args) {
        NeiBuLei.getInstance();
    }

}
