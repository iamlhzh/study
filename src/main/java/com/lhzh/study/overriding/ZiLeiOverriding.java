package com.lhzh.study.overriding;

import com.lhzh.study.constructor.FuLei;

public class ZiLeiOverriding extends FuLeiOverriding {

    public void speak(){
        System.out.println("子类说话！");
    }
    public void speak(int i){
        System.out.println("子类int说话！"+i);
    }

    public void speak(short i){
        System.out.println("子类short说话！"+i);
    }
}
