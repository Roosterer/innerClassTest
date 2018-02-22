package com.gk.singleton;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class DCL {

    //关键字 volatile（变量的状态修改会从线程内存写回到主内存）
    private volatile static Object instance;

    private DCL(){};

    //双重校验
    public Object getInstance(){
        if(instance == null){
            synchronized (DCL.class){
                if(instance == null){
                    instance = new Object();
                }
            }
        }
        return instance;
    }

}
