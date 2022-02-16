package com.lhzh.study.polymorphism;

public class ZiLei extends FuLei {

    public String hobby;

    static String music;

    public void eat() {
        System.out.println("ZiLei eat");
    }

    public void teach(){
        System.out.println("ZiLei teach");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public static String getMusic() {
        return music;
    }

    public static void setMusic(String music) {
        ZiLei.music = music;
    }
}
