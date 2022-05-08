package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public Calculator(int num1, String sign, int num2 ) {
        this.num1 = num1;
        this.sign = sign.charAt(0);
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public char getSign() {
        return sign;
    }

    public float calculate() {
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
                return (float) Math.sqrt(-1);
        }
    }
}