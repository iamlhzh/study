package com.lhzh.study.constructor;

public class ZiLei extends FuLei {

    {
        System.out.println("子类的代码块");
    }
    static {
        System.out.println("子类的静态代码块");
    }

    private String ZiName;

    public ZiLei(){
        System.out.println("子类无参构造方法");
    }

    public ZiLei(String ziName) {
        ZiName = ziName;
        System.out.println("子类有参构造方法");
    }

    public ZiLei(String fuName, String ziName) {
        super(fuName);
        ZiName = ziName;
        System.out.println("子类有父参构造方法");
    }

    public String getZiName() {
        return ZiName;
    }

    public void setZiName(String ziName) {
        ZiName = ziName;
    }
}
