package com.lhzh.study.beaninit;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author 卢宏政
 * @date 2021/10/30 11:58
 */
public class A implements InitializingBean {

    private B b;
    private String name; // = b.funb();

    public void setB(B b) {
        System.out.println("A.setB initialed");
        this.b = b;
    }

    public A() {
        System.out.println("A initialed");
    }

    public void init() {
        System.out.println("init");
        this.name = b.funb();
    }

    @Override
    public String toString() {
        return super.toString() + this.name;
    }

    public void afterPropertiesSet() throws Exception {

        //其实放在这里也可以

        //this.name = b.funb();
        System.out.println("afterPropertiesSet");

    }

}

