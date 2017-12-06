package com.sl.demo.singleton;

// 懒汉式单例模式
// 比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
public class LazySingleton {
    // 静态私用成员，没有初始化
    private static LazySingleton instance;

    // 私有构造函数
    private LazySingleton() {

    }

    // 静态，同步，公开访问点
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
