package com.sl.demo.singleton;

public class LazySafetySingleton {
    private static LazySafetySingleton instance;

    private LazySafetySingleton() {

    }

    public static synchronized LazySafetySingleton getInstance() {
        if (instance == null) {
            instance = new LazySafetySingleton();
        }
        return instance;
    }

    public static LazySafetySingleton getInstance2() {
        synchronized(LazySafetySingleton.class) {
            if (instance == null) {
                instance = new LazySafetySingleton();
            }
        }
        return instance;
    }
}
