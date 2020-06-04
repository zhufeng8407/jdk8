package com.zhufeng.jdk8.leetcode.linkedlist;

import java.util.*;

/**
 * @author zf
 * @version 1.0
 * @date 2020-06-03
 */
public interface MyList<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    boolean add(E e);

    boolean remove(Object o);

    E get(int index);

    E set(int index, E element);

    void add(int index, E element);

    E remove(int index);

    int indexOf(Object o);




}
