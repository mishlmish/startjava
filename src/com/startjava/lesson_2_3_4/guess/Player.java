package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {
    private String name;
    private int[] numbers = new int[10];
    private int counter = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, counter + 1);
    }

    public void setNumber(int currentNumber, int counter) {
        numbers[counter] = currentNumber;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void fillZeroNumbers(int fromNum, int toNum) {
        Arrays.fill(numbers, fromNum, toNum, 0);
    }

    public void printGapNumbers() {

        for (int i = 0; i < counter; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
}