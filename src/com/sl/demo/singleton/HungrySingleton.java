package com.sl.demo.singleton;

// 饿汉单例模式
// 在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
public class HungrySingleton {

    // 静态私有成员，已初始化
    private static HungrySingleton instance = new HungrySingleton();

    // 私有构造函数
    private HungrySingleton() {

    }

    // 静态，不用同步（类加载时已初始化，不会有多线程的问题）
    public static HungrySingleton getInstance() {
        return instance;
    }
}
