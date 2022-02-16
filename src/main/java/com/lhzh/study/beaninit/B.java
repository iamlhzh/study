package com.lhzh.study.beaninit;

/**
 * @author 卢宏政
 * @date 2021/10/30 11:58
 */
public class B {

    public String funb() {
        System.out.println("funb");
        return "B.funb";
    }

    public B() {
        System.out.println("B initialed");
    }
}