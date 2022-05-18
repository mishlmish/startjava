package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int toNum = 100;
    private Player player1;
    private Player player2;
    private int testNumber;
    private Random randomNum = new Random();
    private Scanner console = new Scanner(System.in);
    private String answer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void printGapNumbers(int[] numbers, int testNumber) {

        for (int i = 0; i < testNumber; i++) {
            System.out.print(" " + numbers[i]);
        }
    }

    public void launch() {
        do {
            int randomNumber = randomNum.nextInt(toNum) + 1;
            Player currentPlayer = player2;
            int tempNumber;

            while (testNumber < 10) {
                currentPlayer = currentPlayer == player1 ? player2 : player1;
                testNumber = currentPlayer.getTestNumber();

                if (testNumber != 10) {
                    System.out.println("\nИгрок " + currentPlayer.getName() + " введите число: ");
                    tempNumber = console.nextInt();
                    currentPlayer.addNumber(tempNumber, currentPlayer.getTestNumber());
                    currentPlayer.setTestNumber(testNumber + 1);

                    if (tempNumber == randomNumber) {
                        System.out.println("\nИгрок: " + currentPlayer.getName() + " угадал число " + tempNumber +
                                " с " + (testNumber + 1) + "-й попытки");
                        break;
                    }

                    if (tempNumber > randomNumber) {
                        System.out.println("\nДанное число " + tempNumber + " больше, чем загадал компьютер\n");
                    } else {
                        System.out.println("\nДанное число " + tempNumber + " меньше, чем загадал компьютер\n");
                    }

                    if (testNumber == 9) {
                        System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки");
                    }
                } else {
                    break;
                }
            }

            System.out.println("\nЧисла, которые вводили игроки: ");

            System.out.println(player1.getName());
            printGapNumbers(player1.getNumbers(), player1.getTestNumber());

            System.out.println("\n" + player2.getName());
            printGapNumbers(player2.getNumbers(), player2.getTestNumber());

            do {
                System.out.println("\nХотите играть ещё? [yes/no] : ");
                answer = console.next();

                if (answer.equals("yes")) {
                    player1.clearNumbers(0, player1.getTestNumber());
                    player2.clearNumbers(0, player2.getTestNumber());

                    player1.setTestNumber(0);
                    player2.setTestNumber(0);
                }
            } while (!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while (!answer.equals("no"));
    }
}