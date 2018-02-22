package com.gk.singleton;

import java.io.*;

/**
 * Created by gaokuo on 2018/2/22.
 */
public class 序列化问题 {

    /*二、单例的实现要注意什么
    1. 线程安全，既然是单例，多线程下也只能创建一个实例。
    2. 延迟加载，这个是可选的，可看场景是否选择延迟加载。
    3. 序列化与反序列安全，（网上看到的，待验证https://www.cnblogs.com/andy-zhou/p/5363585.html）*/

    //序列化参考：
    //验证序列化与反序列安全的问题
    //被序列化的类需要实现 Serializable 接口，使用 ObjectInputStream 和 ObjectOutputStream 进行对象的读写

    public static void main(String[] args) throws Exception{
//        Instance instance = EHan.getInstance();
//        System.out.println(instance.hashCode());
//
//        //序列化instance
//        File file = new File("d://result.txt");
//        OutputStream fo = new FileOutputStream(file);
//        InputStream fi = new FileInputStream(file);
//        ObjectOutputStream out = new ObjectOutputStream(fo);
//        out.writeObject(instance);
//        out.flush();
//        out.close();
//
//        //反序列化
//        ObjectInputStream in = new ObjectInputStream(fi);
//        Instance instance1 = (Instance) in.readObject();
//        System.out.println(instance1.hashCode());
//        in.close();


        //enum的序列化，序列化前后是同一个hashcode，上面注释部分是不能的，很神奇

        MeiJu instance = MeiJu.instance;
        System.out.println(instance.hashCode());

        //序列化instance
        File file = new File("d://result.txt");
        OutputStream fo = new FileOutputStream(file);
        InputStream fi = new FileInputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(instance);
        out.flush();
        out.close();

        //反序列化
        ObjectInputStream in = new ObjectInputStream(fi);
        MeiJu instance1 = (MeiJu) in.readObject();
        System.out.println(instance1.hashCode());
        in.close();

        //使用枚举除了线程安全和防止反射强行调用构造器之外，还提供了自动序列化机制，防止反序列化的时候创建新的对象。
        // 因此，Effective Java推荐尽可能地使用枚举来实现单例



    }





}
