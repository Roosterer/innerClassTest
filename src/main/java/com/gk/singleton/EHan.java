package com.gk.singleton;

import java.io.Serializable;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class EHan{

    //饿汉模式，顾名思义，类初始化的时候就初始化实例。

    //线程安全

    private static Instance instance = new Instance();

    private EHan(){};

    public static Instance getInstance(){
        return instance;
    }
}
