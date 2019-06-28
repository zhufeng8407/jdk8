package com.zhufeng.jdk8.stream2;

public class AutoCloseableTest implements AutoCloseable {


    public static void main(String[] args) throws Exception {

        try(AutoCloseableTest test = new AutoCloseableTest()){
            test.doSomething();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println(" close invoked");
    }

    public void doSomething() {
        System.out.println("doSomething invoked");
    }
}
