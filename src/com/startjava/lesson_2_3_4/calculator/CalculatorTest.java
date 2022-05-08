package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    
    public static void main(String[] args) {
        String answer;
        Scanner console = new Scanner(System.in);

        do {
            System.out.print("\nВведите выражение в формате число пробел знак пробел число: ");
            String inputExpression = console.nextLine();
            String[] splitedData = inputExpression.split(" ");

            Calculator calc = new Calculator(Integer.parseInt(splitedData[0]), splitedData[1],
                    Integer.parseInt(splitedData[2]));

            System.out.println(calc.getNum1() +  " " + calc.getSign() + " " + calc.getNum2() + " = " + calc.calculate());

            do {
                System.out.println("\nПродолжить вычисления? [yes/no] : ");
                answer = console.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while(!answer.equals("no"));
    }
}