import java.util.Scanner;

class  CalculatorTest {
    
    public static void main(String[] args) {
        boolean makingMoreCalc = false;
        String answer;

        Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nВведите первое число: ");

            calc.setNum1(scanner.nextInt());

            System.out.print("\nВведите знак математической операции: ");

            calc.setSign(scanner.next().charAt(0));

            System.out.print("\nВведите второе число: ");

            calc.setNum2(scanner.nextInt());

            calc.calculate();

            boolean moreAsking;

            do  {
                System.out.println("Хотите продолжить вычисления? [yes/no] : ");
                answer = scanner.next();

                if(answer.charAt(0) == 'y' && answer.charAt(1) == 'e' && answer.charAt(2) == 's') {
                    makingMoreCalc = true;
                    moreAsking = false;
                } else if(answer.charAt(0) == 'n' && answer.charAt(1) == 'o') {
                    makingMoreCalc = false;
                    moreAsking = false;
                } else {
                moreAsking = true;
                }
            } while(moreAsking);
        } while(makingMoreCalc);
    }
}