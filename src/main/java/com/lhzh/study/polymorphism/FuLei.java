package com.lhzh.study.polymorphism;

public class FuLei {

    public String name;

    static String color;

    public void eat(){
        System.out.println("FuLei eat!");
    }

    public void speak(){
        System.out.println("FuLei speak!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        FuLei.color = color;
    }
}
