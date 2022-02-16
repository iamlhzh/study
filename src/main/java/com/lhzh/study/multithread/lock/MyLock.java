package com.lhzh.study.multithread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock {
    public static void main(String[] args) {
        MyLockThread sharedResource = new MyLockThread();
        int num = 5;
        for (int i = 1; i <= num; i++) {
            new Thread(() -> {
                sharedResource.print5();
            }, "A").start();
        }
        for (int i = 1; i <= num; i++) {
            new Thread(() -> {
                sharedResource.print10();
            }, "B").start();
        }
        for (int i = 1; i <= num; i++) {
            new Thread(() -> {
                sharedResource.print15();
            }, "C").start();
        }
    }
}
