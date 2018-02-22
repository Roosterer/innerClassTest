package com.gk.staticInnerClass;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class App {

    public static void main(String[] args) {


        //静态内部类可以直接new，但是要带上外部类的名字，如下
        OutClass.InnerClass i = new OutClass.InnerClass();
        //如果静态内部类是private的，不能通过上面的方式new出实例

        //如果静态内部类没有引用外部类的静态成员，创建内部类也不会初始化外部类

    }
}
