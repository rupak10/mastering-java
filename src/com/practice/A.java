package com.practice;

public class A implements InterfaceB, InterfaceC {
    @Override
    public void print() {
        System.out.println("inside print() method: InterfaceB");
    }

    @Override
    public void printC() {
        System.out.println("inside print() method: InterfaceC");
    }
}
