class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(String sign) {
        this.sign = sign.charAt(0);
    }

    public void calculate() {
        float result;

        switch (sign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = (float) num1 / (float) num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^' :
                if(num1 == 1) {
                    result = 1;
                    break;
                } else if(num1 > 0 && num2 > 0) {
                    result = 1;
                    for(int i = 0; i < num2; i++) {
                        result *= num1;
                    } 
                    break;
                } else {
                    System.out.println("\nДля возведения в степень используйте " +
                            "положительные целые числа\n");
                }
                return;
            default :
                System.out.println("\nВведите правильный знак математической операции");
                return;
        }
        System.out.println("\n" + num1 + " " + sign + " " + num2 + " = " + result + "\n");
    }
}