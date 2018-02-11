package com.brainacademy.labwork2_16_5;

public class Main {

    public static void foo(int i) {
        System.out.println("int");
    }

    public static void foo(byte b) {
        System.out.println("byte");
    }

    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.16.5");
        System.out.println("-------------------------------------------");

        byte b = 5;
        foo(b);
        foo(5);
        System.out.println("Remark : int is the default type for integer numbers, that is why this foo is called for int param.");

        System.out.println("******************************************");
    }
}