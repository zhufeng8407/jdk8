package com.zhufeng.jdk8.Spliterator;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class IntConsumerTest {

    public static void main(String[] args) {
        IntConsumerTest test = new IntConsumerTest();
        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);
//        test.testConsumer(consumer);            // �������ʽ
//        test.testConsumer(consumer::accept);    // ����ʽ��ʽ
        test.testConsumer(intConsumer::accept); // ����ʽ��ʽ
    }

    private void testConsumer(Consumer<? super Integer> cons) {
        System.out.println(cons instanceof IntConsumer);
        cons.accept(100);
    }

//    public void testConsumer(IntConsumer cons) {
//        System.out.println(cons instanceof IntConsumer);
//        cons.accept(100);
//    }

}
