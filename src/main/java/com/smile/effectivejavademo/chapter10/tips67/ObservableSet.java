package com.smile.effectivejavademo.chapter10.tips67;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-30 14:45
 **/
public class ObservableSet<E> extends ForwardingSet<E> {

    public ObservableSet(Set<E> s) {
        super(s);
    }

    private final List<SetObserver<E>> observers = new ArrayList<>();

    public void addObserver(SetObserver<E> observer) {
        synchronized (observers) {
        observers.add(observer);
        }
    }

    public boolean removeObserver(SetObserver<E> observer) {
        synchronized (observers) {
        return observers.remove(observer);
        }
    }

//    private void notifyElementAdded(E element) {
//        synchronized (observers) {
//            for (SetObserver<E> observer : observers) {
//                observer.added(this, element);
//            }
//        }
//    }

//    private void notifyElementAdded(E element) {
//        for (SetObserver<E> observer : observers) {
//            observer.added(this, element);
//        }
//    }


    private void notifyElementAdded(E element) {
        List<SetObserver<E>> snapshot = null ;


        synchronized (observers) {
            snapshot = new ArrayList<>(observers);

        }
        for (SetObserver<E> observer : snapshot) {
            observer.added(this, element);
        }
    }

    @Override
    public boolean add(E e) {
        boolean added = super.add(e);
        if (added) {
            notifyElementAdded(e);
        }
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c) {
            result |= add(element);
        }
        return result;
    }


    public static void main(String[] args) {
        ObservableSet<Integer> observableSet = new ObservableSet<>(new HashSet<>());
        observableSet.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                System.out.println(element);
                if (element == 23) {

//                    set.removeObserver(this);
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    final SetObserver<Integer> observer = this;
                    try {
                        executorService.submit(new Runnable() {
                            @Override
                            public void run() {
                                set.removeObserver(observer);
                            }
                        }).get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } finally {
                        executorService.shutdown();
                    }


                }

            }
        });

        for (int i = 0; i < 100; i++) {
            observableSet.add(i);
        }


    }
}
