package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int toNum = 100;
    private Player[] newcomerPlayers;
    private int count;
    private Random randomNum = new Random();
    private Scanner console = new Scanner(System.in);
    private Player currentPlayer;
    private Player[] players = new Player[3];

    public GuessNumber(Player[] newcomerPlayers) {
        this.newcomerPlayers = Arrays.copyOf(newcomerPlayers, 3);
    }

    public void launch() {
        int currentNumber;

        System.out.println("\nИгра состоит из трех раундов");

        for (int round = 1; round < 4; round++){
            System.out.println("\n\nРаунд " + round);
            int randomNumber = randomNum.nextInt(toNum) + 1;

            shuffle();
            System.out.println("\nРезультаты жеребьевки: сначала угадывает " + players[0].getName() +
                    ", потом " + players[1].getName() + ", потом " + players[2].getName());

            for (int i = 0; i < 3; i++) {
                players[i].clearNumbers();
            }

            while (count < 10) {
                currentPlayer = currentPlayer == players[0] ? players[1] :
                        currentPlayer == players[1] ? players[2] : players[0];

                count = currentPlayer.getCount();

                if (count != 10) {
                    do {
                        try {
                            System.out.println("\nИгрок " + currentPlayer.getName() + " введите число: ");
                            currentNumber = console.nextInt();
                            currentPlayer.addNumber(currentNumber);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (true);

                    currentPlayer.setCount(count + 1);

                    if (currentNumber == randomNumber) {
                        System.out.println("\nВ " + round + "-м раунде игрок: " + currentPlayer.getName() +
                                " угадал число " + currentNumber + " с " + (count + 1) + "-й попытки");

                        currentPlayer.incrementWinsNumber();
                        currentPlayer.addWinsScore(count + 1);
                        break;
                    }

                    String comparison = currentNumber > randomNumber ? " больше" : " меньше";
                    System.out.println("\nДанное число " + currentNumber + comparison + ", чем загадал компьютер\n");

                    if (count == 9) {
                        System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки");
                    }
                }
            }

            System.out.println("\nЧисла, которые вводили игроки в " + round + "-м раунде: ");
            for (int i = 0; i < 3; i++) {
                printPlayerNumbers(players[i]);
            }
            if (round == 3 ) {
                chooseTheWinner();
            }
        }
    }

    private void printPlayerNumbers(Player player) {
        System.out.println("\n" + player.getName());
        for (int i = 0; i < player.getCount(); i++) {
            System.out.print(" " + player.getNumbers()[i]);
        }
    }

    private void shuffle() {
        int tripleOutcomes[][] = {{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}};
        int randomNumber = randomNum.nextInt(5);
        for (int i = 0; i < 3; i++) {
            players[i] = newcomerPlayers[tripleOutcomes[randomNumber][i]];
        }
    }

    private void chooseTheWinner() {
        int maxScore = players[0].getWinScore();
        String[] winnerNames = {"", "", ""};

        for (int i = 0; i < 3; i++) {
            if (players[i].getWinsNumber() > 1) {
                winnerNames[0] = players[i].getName();
            }
        }

        if (winnerNames[0].equals("")) {
            for (int i = 1; i < 3; i++) {
                if (players[i].getWinScore() > maxScore) {
                    maxScore = players[i].getWinScore();
                }
            }

            for (int i = 0; i < 3; i++) {
                if (players[i].getWinScore() == maxScore) {
                    winnerNames[i] = players[i].getName();
                }
            }
        }

        System.out.println("\nПо результатам трех раундов в игре побеждает: "  + winnerNames[0] + " " + winnerNames[1] +
                " " + winnerNames[2] +"!!!");
    }
}