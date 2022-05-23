package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer;
        Player[] players = new Player[3];

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nВведите имя " + (i + 1) + "-го игрока");
            players[i] = new Player(console.nextLine());
        }

        do {
            GuessNumber game = new GuessNumber(players);
            game.launch();

            do {
                System.out.println("\nХотите играть ещё? [yes/no] : ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while (!answer.equals("no"));
    }
}