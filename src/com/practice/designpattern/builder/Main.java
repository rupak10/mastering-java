package com.practice.designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().id(12L).name("Rupak").build();
        System.out.println("student = " + student);
    }
}
