package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {
    private String name;
    private int[] statisticNumbers = new int[11];
    private int counter = 0;


    public Player(String name) {

        this.name = name;
    }

    public int getNumbersCounter()
    {
        return counter;
    }

    public void setStatisticNumbersCounter(int numbersCounter)
    {
        this.counter = numbersCounter;
    }


    public String getName() {

        return name;
    }

    public void setStatisticNumber(int currentNumber, int counter) {
        statisticNumbers[counter] = currentNumber;
    }

    public int getCounter() {
        return counter;
    }

    public void zeroStatisticNumbers(int fromNum, int toNum) {
        Arrays.fill(statisticNumbers, fromNum, toNum, 0);
    }

    public void printGapStatisticNumbers() {
        for(int i = 0; i < counter; i++) {
            System.out.print(" " + statisticNumbers[i]);
        }
    }
}

