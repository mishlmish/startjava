package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer;

        do {
            System.out.println("\nВведите имя первого игрока");
            Player player1 = new Player(console.nextLine());

            System.out.println("\nВведите имя второго игрока");
            Player player2 = new Player(console.nextLine());

            System.out.println("У каждого игрока 10 попыток угадать число от 1 до 100");

            GuessNumber game = new GuessNumber(player1, player2);

            game.launch();

            do {
                System.out.println("\nХотите играть ещё? [yes/no] : ");
                answer = console.next();
                if (answer.equals("yes")) {
                    player1.fillZeroNumbers(0, player1.getCounter());
                    player2.fillZeroNumbers(0, player2.getCounter());
                }
            } while (!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while (!answer.equals("no"));
    }
}