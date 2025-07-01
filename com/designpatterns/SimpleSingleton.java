package com.designpatterns;

public class SimpleSingleton {
//     In this class I'm implemented the Singleton.
    private static SimpleSingleton instance = null;

    private SimpleSingleton() {
        System.out.println("Singleton Constructor Called!");
    }

    public static SimpleSingleton getInstance() {
        if(instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        SimpleSingleton s1 = new SimpleSingleton();
        SimpleSingleton s2 = new SimpleSingleton();

        System.out.println(s1 == s2);
    }
}
