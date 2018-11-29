package com.smile.effectivejavademo.chapter5.tips29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Smile(wangyajun)
 * @create 2018-11-29 8:41
 **/
public class Favorities {

    private Map<Class<?>, Object> favorites = new HashMap<>();


    public <T> void putFavorite(Class<T> type, T instance) {
        if (type == null) {
            throw new NullPointerException();
        }
        favorites.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }


    public static void main(String[] args) {
        Favorities f = new Favorities();
        f.putFavorite(String.class, "java");
        f.putFavorite(String.class, "python");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorities.class);

        String favorite = f.getFavorite(String.class);
        Integer integer = f.getFavorite(Integer.class);
        Class favoriteClass = f.getFavorite(Class.class);
        System.out.printf("%s %x %s%n", favorite, integer, favoriteClass.getName());


    }


    static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
        Class<?> annotationType = null;
        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return element.getAnnotation(annotationType.asSubclass(Annotation.class));
    }

}
