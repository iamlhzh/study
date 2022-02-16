package com.lhzh.study.polymorphism;

import java.util.Random;

public class LiteralTest {
    /**/
    public static void sayHello(String arg){//新增重载方法
        System.out.println("hello String");
    }

    public static void sayHello(char arg){
        System.out.println("hello char");
    }
    public static void sayHello(int arg){
        System.out.println("hello int");
    }

    public static void sayHello(long arg){
        System.out.println("hello long");
    }

    public static void sayHello(Character arg){
        System.out.println("hello Character");
    }
    public static void main(String[] args) {
        sayHello('a');
        Random r=new Random();
        String s="abc";
        int i=0;
//        sayHello(r.nextInt()%2!=0?s:i);//编译错误
//        sayHello(r.nextInt()%2!=0?'a':false);//编译错误
    }
}