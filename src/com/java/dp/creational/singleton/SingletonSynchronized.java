package com.java.dp.creational.singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized singleton;

    private SingletonSynchronized() {}

    public static SingletonSynchronized getInstance(){
        if (singleton == null)
            synchronized (SingletonSynchronized.class) {
                if (singleton == null)
                    singleton = new SingletonSynchronized();
            }
        return singleton;
    }
}
