package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    
    public static void main(String[] args) {
        String answer;
        Scanner console = new Scanner(System.in);

        do {
            System.out.print("\nВведите выражение в формате число  пробел знак пробел число: ");
            String inputExpression = console.nextLine();

            Calculator calc = new Calculator(inputExpression);

            System.out.println(inputExpression + " = " + calc.calculate());

            do {
                System.out.println("\nПродолжить вычисления? [yes/no] : ");
                answer = console.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while(!answer.equals("no"));
    }
}