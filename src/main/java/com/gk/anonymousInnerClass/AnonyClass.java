package com.gk.anonymousInnerClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnonyClass {

    public static void main(String[] args) {

        //1. 普通new对象
//        new Temp().fun();

        //2. new对象，并完成类中实现
        new Object(){
            void fun(){
                System.out.println("anony fun");
            }
        }.fun();

        //3. new 接口，实现接口

        Collections.sort(new ArrayList<String>(), new Comparator<String>() {
            public int compare(String o1, String o2) {
                return 0;
            }
        });

    }

}
