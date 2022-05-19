package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int toNum = 100;
    private Player player1;
    private Player player2;
    private int count;
    private Random randomNum = new Random();
    private Scanner console = new Scanner(System.in);
    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        int randomNumber = randomNum.nextInt(toNum) + 1;
        int currentNumber;

        player1.clearNumbers();
        player2.clearNumbers();

        while (count < 10) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            count = currentPlayer.getCount();

            if (count != 10) {
                System.out.println("\nИгрок " + currentPlayer.getName() + " введите число: ");
                currentNumber = console.nextInt();
                currentPlayer.addNumber(currentNumber);
                currentPlayer.setCount(count + 1);

                if (currentNumber == randomNumber) {
                    System.out.println("\nИгрок: " + currentPlayer.getName() + " угадал число " + currentNumber +
                            " с " + (count + 1) + "-й попытки");
                    break;
                }

                if (currentNumber > randomNumber) {
                    System.out.println("\nДанное число " + currentNumber + " больше, чем загадал компьютер\n");
                } else {
                    System.out.println("\nДанное число " + currentNumber + " меньше, чем загадал компьютер\n");
                }

                if (count == 9) {
                    System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки");
                }
            }
        }

        System.out.println("\nЧисла, которые вводили игроки: ");
        printPlayerNumbers(player1);
        printPlayerNumbers(player2);
    }

    private void printPlayerNumbers(Player player) {
        System.out.println("\n" + player.getName());
        for (int i = 0; i < player.getCount(); i++) {
            System.out.print(" " + player.getNumbers()[i]);
        }
    }
}