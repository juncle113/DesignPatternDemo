package com.sl.demo.singleton;

public class StaticSingleton {
    private static StaticSingleton instance;

    private StaticSingleton() {

    }

    static {
        instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return instance;
    }
}
