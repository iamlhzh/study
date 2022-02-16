package com.lhzh.study.constructor;

public class FuLei extends ZuFuLei{
    {
        System.out.println("父类的代码块");
    }
    static {
        System.out.println("父类的静态代码块");
    }

    public FuLei(){
        System.out.println("父类无参构造方法");
    }
    public FuLei(String fuName) {
        this.fuName = fuName;
        System.out.println("父类有参构造方法");
    }

    private String fuName;

    public String getFuName() {
        return fuName;
    }

    public void setFuName(String fuName) {
        this.fuName = fuName;
    }
}
