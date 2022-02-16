package com.lhzh.study.polymorphism.test;

public class Solution {
    public class A {
        public void show(A obj){
            System.out.println("A and A");
        }
        public void show(C obj){
            System.out.println("A and C");
        }
    }
    public class B extends A {
        public void show(B obj){
            System.out.println("B and B");
        }
        public void show(A obj){
            System.out.println("B and A");
        }
    }
    public class C extends B {
    }
    public static void main(String[] args) {
        Solution solution =new Solution();
        Solution.A a1=solution.new A();
        Solution.A a2=solution.new B();
        Solution.B b =solution.new B();
        Solution.C c =solution.new C();
        a1.show(b);
        a1.show(c);
        a2.show(b);
        a2.show(c);
    }

}
