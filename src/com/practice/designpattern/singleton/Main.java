package com.practice.designpattern.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.putValue(1, "Rupak");
        singleton.putValue(2, "Dhara");

        System.out.println("singleton = " + singleton.getValue(1));
    }
}
