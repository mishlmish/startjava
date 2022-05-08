package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    private String inputExpression;

    public Calculator(String inputExpression) {
        this.inputExpression = inputExpression;
    }

    public float calculate() {
        String[] splitedData = inputExpression.split(" ");
        int num1 = Integer.parseInt(splitedData[0]);
        char sign = splitedData[1].charAt(0);
        int num2 = Integer.parseInt(splitedData[2]);

        switch (sign) {
            case '+' :
                return Math.addExact(num1, num2);
            case '-' :
                return Math.subtractExact(num1, num2);
            case '*' :
                return Math.multiplyExact(num1, num2);
            case '/' :
                return (float) num1 / (float) num2;
            case '%' :
                return num1 % num2;
            case '^' :
                return (float) Math.pow((double) num1, (double) num2);
            default :
                System.out.println("\nВведите правильный знак математической операции");
                return 0;
        }
    }
}