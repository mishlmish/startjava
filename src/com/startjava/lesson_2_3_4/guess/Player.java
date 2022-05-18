package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {
    private String name;
    private int[] numbers = new int[10];
    private int testNumber = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, testNumber + 1);
    }

    public void addNumber(int currentNumber, int testNumber) {
        numbers[testNumber] = currentNumber;
    }

    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int preTestNumber) {
        this.testNumber = preTestNumber;
    }

    public void clearNumbers(int fromNum, int testNumber) {
        Arrays.fill(numbers, fromNum, testNumber, 0);
    }
}