package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int count;
    private Random randomNum = new Random();
    private Player currentPlayer;
    private Player[] players = new Player[3];

    public GuessNumber(Player[] players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void launch() {
        int currentNumber;

        System.out.println("\nИгра состоит из трех раундов");
        System.out.println("У игроков есть по 10 попыток в каждом раунде угадать число от 1 до 100");

        for (int round = 1; round < 4; round++) {
            System.out.println("\n\nРаунд " + round);
            int toNum = 100;
            int randomNumber = randomNum.nextInt(toNum) + 1;

            shuffle();
            System.out.println("\nРезультаты жеребьевки: сначала угадывает " + players[0].getName() +
                    ", потом " + players[1].getName() + ", потом " + players[2].getName());

            for (int i = 0; i < 3; i++) {
                players[i].clearNumbers();
            }

            count = 0;
            int PlayersOrder = 0;

            while (count < 10) {
                currentPlayer = players[PlayersOrder++ % 3];
                count = currentPlayer.getCount();

                if (count != 10) {
                    do {
                        try {
                            System.out.println("\nИгрок " + currentPlayer.getName() + " введите число: ");
                            Scanner console = new Scanner(System.in);

                            currentNumber = console.nextInt();
                            currentPlayer.addNumber(currentNumber);
                            break;
                        } catch (Exception e) {
                            System.out.println("\"Введите число от 1 до 100\"");
                        }
                    } while (true);

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

            printPlayersNumbers(players, round);

            if (round == 3) {
                chooseWinner();
            }
        }
    }

    private void shuffle() {
        int tripleSets[][] = {{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}};
        int randomNumber = randomNum.nextInt(5);
        Player[] draftPlayers = new Player[3];
        for (int i = 0; i < 3; i++) {
            draftPlayers[i] = players[tripleSets[randomNumber][i]];
        }
        players = draftPlayers;
    }

    private void printPlayersNumbers(Player[] players, int round) {
        System.out.println("\nЧисла, которые вводили игроки в " + round + "-м раунде: ");

        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + players[i].getName());
            for (int j = 0; j < players[i].getCount(); j++) {
                System.out.print(" " + players[i].getNumbers()[j]);
            }
        }
    }

    private void chooseWinner() {
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

        System.out.println("\n\nПо результатам трех раундов в игре побеждает: " + winnerNames[0] + " " + winnerNames[1] +
                " " + winnerNames[2] + "!!!");
    }
}