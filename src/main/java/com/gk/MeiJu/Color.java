package com.gk.MeiJu;

/**
 * Created by gaokuo on 2018/2/22.
 */
public enum Color {
    RED(1),YELLOW(2),BLUE(3);

    Color(int i){
        System.out.println("construct："+i);
    }

    public static void main(String[] args) {
//        if(Color.RED == Color.BLUE){
//        }
        System.out.println(Color.RED);
    }
}
