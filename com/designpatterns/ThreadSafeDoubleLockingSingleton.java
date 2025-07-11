package com.designpatterns;

public class ThreadSafeDoubleLockingSingleton {

    private static ThreadSafeDoubleLockingSingleton instance = null;

    private ThreadSafeDoubleLockingSingleton() {
        System.out.println("Singleton Constructor Called!");
    }

    // Double check locking..
    public static ThreadSafeDoubleLockingSingleton getInstance() {
        if (instance == null) { // First check (no locking)
            System.out.println("First called!");
            synchronized (ThreadSafeDoubleLockingSingleton.class) { // Lock only if needed
                if (instance == null) { // Second check (after acquiring lock)
                    System.out.println("Second Called!");
                    instance = new ThreadSafeDoubleLockingSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeDoubleLockingSingleton s1 = ThreadSafeDoubleLockingSingleton.getInstance();
        ThreadSafeDoubleLockingSingleton s2 = ThreadSafeDoubleLockingSingleton.getInstance();

        System.out.println(s1 == s2);
    }
}
