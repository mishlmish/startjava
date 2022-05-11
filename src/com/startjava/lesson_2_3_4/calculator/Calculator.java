package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    public static float calculate(int num1, char sign, int num2) {
        float value = switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> (float) num1 / (float) num2;
            case '%' -> num1 % num2;
            case '^' -> (float) Math.pow((double) num1, (double) num2);
            default ->   {
                System.out.println("\nВведите правильный знак математической операции");
                yield 0;
            }
        };
        return value;
    }
}