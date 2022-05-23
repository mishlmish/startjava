package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {
    private String name;
    private int[] numbers = new int[10];
    private int count;
    private int numberWins;
    private int winScore;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public void addNumber(int currentNumber) throws Exception {
        if (currentNumber > 0 && currentNumber <= 100) {
            numbers[count] = currentNumber;
            count++;
        } else {
            throw new Exception("Введите число от 1 до 100");
        }
    }

    public int getCount() {
        return count;
    }

    public int getWinsNumber() {
        return numberWins;
    }

    public void incrementWinsNumber() {
        numberWins++;
    }

    public int getWinScore() {
        return winScore;
    }

    public void addWinsScore(int attemptNumber) {
        winScore += 10 - attemptNumber;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}