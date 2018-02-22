package com.gk;

/**
 * Hello world!
 *
 */
public class App 
{

    public final transient static  int a =3;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        new App(){
          void fun(){
              System.out.println("匿名内部类的fun方法");
          }
        }.fun();



    }
}
