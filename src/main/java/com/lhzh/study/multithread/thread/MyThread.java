package com.lhzh.study.multithread.thread;

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--------"+i);
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--------"+i);
        }
    }
}
