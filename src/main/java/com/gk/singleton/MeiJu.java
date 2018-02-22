package com.gk.singleton;

/**
 * Created by gaokuo on 2018/2/22.
 */
public enum  MeiJu {
    //枚举对象本身就是要实例化的对象，首先线程安全，也算是延迟加载
    instance;

    private String name = "world";

    public static void main(String[] args) {
        System.out.println(MeiJu.instance);
    }
}
