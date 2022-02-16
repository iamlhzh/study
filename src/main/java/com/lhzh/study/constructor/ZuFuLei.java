package com.lhzh.study.constructor;

public class ZuFuLei {

    private String zuFuName;

    {
        System.out.println("祖父类的代码块");
    }
    static {
        System.out.println("祖父类的静态代码块");
    }

    public ZuFuLei() {
        System.out.println("祖父类的无参构造器");
    }

    public ZuFuLei(String zuFuName) {
        this.zuFuName = zuFuName;
        System.out.println("祖父类的有参构造器");
    }

    public String getZuFuName() {
        return zuFuName;
    }

    public void setZuFuName(String zuFuName) {
        this.zuFuName = zuFuName;
    }
}
