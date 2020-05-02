package com.kaustubh.bettercollections.datastructures;

public interface Tree<T> {

    public void insert(T value);
    public T delete(T value);
    public T search(T value);

}
