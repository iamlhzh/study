package com.lhzh.study.polymorphism.test3;

class A{
    public void show(){
        show2();
    }
    public void show2(){
        System.out.println("wo");
    }
}

class B extends A{
    public void show2(){
        System.out.println("ai");
    }
}
class C extends B{
    public void show2(){
        System.out.println("ni");
    }
}
public class Solution {
    public static void main(String[] args) {
        A a=new B();
        a.show();
        B b = new C();
        b.show();
    }
}
