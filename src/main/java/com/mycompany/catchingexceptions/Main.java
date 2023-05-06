package com.mycompany.catchingexceptions;

public class Main {
    public static void methodC() throws ExceptionC {
        System.out.println("inside methodC...");
        throw new ExceptionC("my ExceptionC is thrown");
    }
    
    public static void methodB() throws ExceptionB {
        System.out.println("inside methodB...");
        throw new ExceptionB("my ExceptionB is thrown");
    }
    
    public static void main(String[] args) {
        System.out.println("first line...before try");
        try {
            System.out.println("second line...top of try");
            methodC();
            System.out.println("third line...bottom of try");
        } catch (ExceptionA ea) {
            System.out.println("...inside ExceptionA catch");
        } finally {
            System.out.println("...inside finally");
        }
        System.out.println("last line of main");
    }
}