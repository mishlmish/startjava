package com.startjava.lesson_2_3_4.person;

class Person {
    boolean isMan = true;
    String name = "Mike";
    float height = 1.80f;
    int weight = 80;
    int age = 35;

    void walk() {
        System.out.println("walking");
    }

    void jump() {
        System.out.println("jumping");
    }

    void run() {
        System.out.println("running");
    }

    String speak() {
        return "speaking";
    }

    boolean isStudyingJava() {
        return true;
    }
}