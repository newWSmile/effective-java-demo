package com.smile.effectivejavademo.chapter5.tips25;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-28 11:18
 **/
public class CollectionsService {
    public static Object reduce(List list, Function f, Object intVal) {
        synchronized (list) {
            Object result = intVal;
            for (Object o : list) {
                result = f.apply(result, o);
            }
            return result;
        }
    }


    public Object reduce2(List list, Function f, Object intVal) {
        Object[] snapshot = list.toArray();
        Object result = intVal;
        for (Object e : snapshot) {
            result = f.apply(result, e);
        }
        return result;
    }

    public static <E> E reduce3(List<E> list, Function<E> f, E intVal) {
        List<E> snapshot;
        synchronized (list) {
            snapshot = new ArrayList<>();
        }
        E result = intVal;
        for (E e : snapshot) {
            result = f.apply(result, e);
        }
        return result;

    }

    interface Function<E> {
        E apply(E arg1, E arg2);
    }
}
