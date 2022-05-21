package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer;
        Player[] newcomerPlayers = new Player[3];

        do {
            for (int i = 0; i < 3 ; i++) {
                System.out.println("\nВведите имя " + (i + 1) + "-го игрока");
                newcomerPlayers[i] = new Player(console.nextLine());
            }

            System.out.println("У каждого игрока 10 попыток угадать число от 1 до 100");

            GuessNumber game = new GuessNumber(newcomerPlayers);
            game.launch();

            do {
                System.out.println("\nХотите играть ещё? [yes/no] : ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while (!answer.equals("no"));
    }
}