package com.gk.singleton;

import sun.security.jca.GetInstance;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class LanHan {

    private static Object instance;

    //懒汉顾名思义，需要时才会创建，延迟加载
    // 2中实现，线程安全和线程不安全

    private LanHan(){};

    //1. 非线程安全
    public static Object getInstance1(){

        if(instance == null){
            instance = new Object();
        }
        return instance;
    }

    //2. 线程安全
    public synchronized static Object getInstance2(){
        if(instance == null){
            instance = new Object();
        }
        return instance;
    }
}
