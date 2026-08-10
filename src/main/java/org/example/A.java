package org.example;

public interface A {
    default void show() {
        System.out.println("A show");
    }
}
