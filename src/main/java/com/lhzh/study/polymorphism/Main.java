package com.lhzh.study.polymorphism;

public class Main {

    public static void main(String[] args) {
        FuLei ziLei = new ZiLei();
        ExcuteObject.excute(ziLei);
        FuLei ziLei2 = new ZiLei2();
        ExcuteObject.excute(ziLei2);
    }
}
