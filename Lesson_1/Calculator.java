class  Calculator {
    public static void main(String[] args) {
        //1. Калькулятор
        System.out.println("\n1. Калькулятор\n");

        int num1 = 3;
        int num2 = 6;
        char sign = '^';
        float result = 0f;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = (float) num1 / (float) num2;
        } else if (sign == '^') {
            int tempNum = num1;
            
            if (num2 == 1) {
                result = num1;
            } else {
                for (int i = 1; i < num2; i++) {
                    tempNum *= num1;
                    result = tempNum;
                }                
            } 
        } else if (sign == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}