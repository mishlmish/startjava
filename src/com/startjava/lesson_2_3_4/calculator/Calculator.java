package com.startjava.lesson_2_3_4.calculator;

class Calculator {


    public static float calculate(String inputExpression) {
        String[] splitedData = inputExpression.split(" ");
        int num1 = 0;
        char sign ='a';
        int num2 = 0;

        if (splitedData.length == 3 && splitedData[1].length() == 1) {
            try {
                num1 = Integer.parseInt(splitedData[0]);
            } catch (IllegalArgumentException e) {
                System.out.println("Первое число - вообше как-то неправильно введено");
            }

            try {
                num2 = Integer.parseInt(splitedData[2]);
            } catch (IllegalArgumentException e) {
                System.out.println("Второе число - неправильно введено как-то");
            }

            sign = splitedData[1].charAt(0);
        } else {
            throw new NumberFormatException("Кто ж такой бред вводит! Не тот формат ввода, дружище)");
        }

        if (num1 > 0 && num2 > 0) {
            return switch (sign) {
                case '+' -> Math.addExact(num1, num2);
                case '-' -> Math.subtractExact(num1, num2);
                case '*' -> Math.multiplyExact(num1, num2);
                case '/' -> (float) num1 / (float) num2;
                case '%' -> num1 % num2;
                case '^' -> (float) Math.pow((double) num1, (double) num2);
                default -> {
                    System.out.println("\nВведите правильный знак математической операции");
                    yield 0;
                }
            };
        } else {
            throw new IllegalArgumentException("Эта или ошибка при вводе первого числа, или при вводе второго, или " +
                    "вы ввели ноли или отрицательные числа, и Калькулятор считать это НЕ БУДЕТ потому, что НЕ СМОЖЕТ)");
        }
    }
}