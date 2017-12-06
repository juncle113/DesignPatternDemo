package com.sl.demo.singleton;

public class StaticInnerSingleton {

    private StaticInnerSingleton() {

    }

    private static class SingletonHolder {
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
