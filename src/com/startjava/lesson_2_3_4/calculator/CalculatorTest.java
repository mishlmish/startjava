package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        String answer;
        Scanner console = new Scanner(System.in);

        String[] splitedData;
        String inputExpression;
        boolean numeric;

        do {
            numeric = true;

            System.out.print("\nВведите выражение в формате: [положительное целое число]  пробел [знак] пробел ");
            System.out.println("[положительное целое число]");
            inputExpression = console.nextLine();
            splitedData = inputExpression.split(" ");

            if (splitedData.length == 3 && splitedData[1].length() == 1) {
                for (int i = 0; i < 3; i = i + 2) {
                    for (int j = 0; j < splitedData[i].length(); j++) {
                        numeric = numeric && splitedData[i].charAt(j) > 47 && splitedData[i].charAt(j) < 58;
                    }
                }

                if (numeric && Integer.parseInt(splitedData[0]) * Integer.parseInt(splitedData[2]) != 0) {
                    System.out.println(inputExpression + " = " +
                            Calculator.calculate(Integer.parseInt(splitedData[0]),
                                    splitedData[1].charAt(0), Integer.parseInt(splitedData[2])));
                } else {
                    System.out.println(" Введите положительные числа");
                }
            } else {
                System.out.println("Вы ввели некорректные данные");
            }

            do {
                System.out.println("\nПродолжить вычисления? [yes/no] : ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();

        } while (!answer.equals("no"));
    }
}