package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    public static boolean computed;

    public static float calculate(String inputExpression) {
        String[] splitedData = inputExpression.split(" ");
        boolean numeric = true;
        computed = true;

        if (splitedData.length == 3 && splitedData[1].length() == 1) {
            for (int i = 0; i < 3; i = i + 2) {
                for (int j = 0; j < splitedData[i].length(); j++) {
                    numeric = numeric && splitedData[i].charAt(j) > 47 && splitedData[i].charAt(j) < 58;
                }
            }

            if (numeric && Integer.parseInt(splitedData[0]) * Integer.parseInt(splitedData[2]) != 0) {

                int num1 = Integer.parseInt(splitedData[0]);
                char sign = splitedData[1].charAt(0);
                int num2 = Integer.parseInt(splitedData[2]);

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
                computed = false;
                return 0;
            }
        } else {
            computed = false;
            return 0;
        }
    }
}