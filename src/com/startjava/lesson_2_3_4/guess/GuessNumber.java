package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int toNum = 100;
    private Player player1;
    private Player player2;
    int counter;
    private Random randomNum = new Random();
    private Scanner console = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        int randomNumber = randomNum.nextInt(toNum) + 1;
        Player currentPlayer = player2;
        int tempNumber;

        while (counter < 10) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            counter = currentPlayer.getCounter();

            if (counter != 10) {
                System.out.println("\nИгрок " + currentPlayer.getName() + " введите число: ");
                tempNumber = console.nextInt();
                currentPlayer.setNumber(tempNumber, currentPlayer.getCounter());
                currentPlayer.setCounter(counter + 1);

                if (tempNumber == randomNumber) {
                    System.out.println("\nИгрок: " + currentPlayer.getName() + " угадал число " + tempNumber +
                            " с " + (counter + 1) + "-й попытки");
                    break;
                }

                if (tempNumber > randomNumber) {
                    System.out.println("\nДанное число " + tempNumber + " больше, чем загадал компьютер\n");
                } else {
                    System.out.println("\nДанное число " + tempNumber + " меньше, чем загадал компьютер\n");
                }

                if (counter == 9) {
                    System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки");
                }
            } else {
                break;
            }
        }

        System.out.println("\nЧисла, которые вводили игроки: ");
        System.out.println(player1.getName());
        player1.printGapNumbers();

        System.out.println("\n" + player2.getName());
        player2.printGapNumbers();
    }
}