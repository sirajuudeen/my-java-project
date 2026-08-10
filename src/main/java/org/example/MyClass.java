package org.example;

public class MyClass implements A, B {
    public static void main(String[] args) {
        MyClass my=new MyClass();
        my.show();
       // my.show();
    }

    @Override
    public void show() {
        A.super.show();  // calls A's default method
        B.super.show();  // calls B's default method
    }
}



