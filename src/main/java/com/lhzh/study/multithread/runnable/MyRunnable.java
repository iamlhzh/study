package com.lhzh.study.multithread.runnable;

class Runnable1 implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--------"+i);
        }
    }
}
public class MyRunnable {
    public static void main(String[] args) {
        Runnable1 r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--------"+i);
        }
    }
}
