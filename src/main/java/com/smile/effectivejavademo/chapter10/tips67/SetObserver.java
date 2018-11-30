package com.smile.effectivejavademo.chapter10.tips67;

public interface SetObserver<E> {
    void added(ObservableSet<E> set,E element);
}
