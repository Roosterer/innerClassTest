package com.gk.innerClass;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class App {

    public static void main(String[] args) {

        //创建外部类
        OutClass out = new OutClass();

        //内部类的创建，依赖外部类的创建
        OutClass.InnerClass inner = out.new InnerClass();

    }

}
