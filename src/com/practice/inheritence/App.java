package com.practice.inheritence;

public class App {
    public static void main(String[] args) {

        InterfaceB ib = new A();
        ib.print();

        InterfaceC ic = new A();
        ic.printC();
    }
}
