package com.zhufeng.jdk8.leetcode.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Foo {

    private volatile AtomicInteger atomicInteger = new AtomicInteger(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.

        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public void run(int[] arr) throws InterruptedException {
        for(int i : arr) {
            switch (i) {
                case 1:
                   first(() -> {
                       System.out.print("one");
                       this.atomicInteger.getAndIncrement();
                   });

                case 2:
                    second(() -> {
                        while(this.atomicInteger.get() != 2) {
                            try {
                                TimeUnit.MICROSECONDS.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.print("two");
                        this.atomicInteger.getAndIncrement();
                    });

                case 3:
                    third(() -> {
                        while(this.atomicInteger.get() != 3) {
                            try {
                                TimeUnit.MICROSECONDS.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.print("three");
                    });
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        foo.run(new int[]{3,2,1});
    }
}
