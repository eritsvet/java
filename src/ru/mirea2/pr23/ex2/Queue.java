package ru.mirea2.pr23.ex2;

public interface Queue {

    void enqueue(Object element);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();

    String show();
}
