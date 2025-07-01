package com.designpatterns;

public class ThreadSafeLockingSingleton {

    private static ThreadSafeLockingSingleton instance = null;

    private  ThreadSafeLockingSingleton() {
        System.out.println("Singleton Constructor Called!");
    }

    public static ThreadSafeLockingSingleton getInstance() {
        synchronized (ThreadSafeLockingSingleton.class) {
            if(instance == null) {
                instance = new ThreadSafeLockingSingleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        ThreadSafeLockingSingleton ts1 = ThreadSafeLockingSingleton.getInstance();
        ThreadSafeLockingSingleton ts2 = ThreadSafeLockingSingleton.getInstance();

        System.out.println(ts1 == ts2);
    }
}
