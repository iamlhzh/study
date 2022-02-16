package com.lhzh.study.overriding;

import com.lhzh.study.constructor.FuLei;
import com.lhzh.study.constructor.ZiLei;

public class Main {
    public static void main(String[] args) {
        ZiLeiOverriding ziLeiOverriding = new ZiLeiOverriding();
//        FuLeiOverriding fuLeiOverriding = new ZiLeiOverriding();
        Short i =1;
        ziLeiOverriding.speak(i);
//        fuLeiOverriding.speak();

    }
}
