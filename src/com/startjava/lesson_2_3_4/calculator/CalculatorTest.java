package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        String answer;
        Scanner console = new Scanner(System.in);

        String inputExpression;

        do {
            System.out.println("\nВведите выражение в формате: [положительное целое число]  пробел [знак] пробел " +
                    "[положительное целое число]");
            inputExpression = console.nextLine();

            try {
                System.out.println(inputExpression + " = " + Calculator.calculate(inputExpression));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            do {
                System.out.println("\nПродолжить вычисления? [yes/no] : ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while (!answer.equals("no"));
    }
}