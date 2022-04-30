import java.util.Scanner;

class  CalculatorTest {
    
    public static void main(String[] args) {
        String answer;

        Calculator calc = new Calculator();

        Scanner console = new Scanner(System.in);

        do {
            System.out.print("\nВведите первое число: ");
            calc.setNum1(console.nextInt());

            System.out.print("\nВведите знак математической операции: ");
            calc.setSign(console.next().charAt(0));

            System.out.print("\nВведите второе число: ");
            calc.setNum2(console.nextInt());

            calc.calculate();

            do {
                System.out.println("\nПродолжить вычисления? [yes/no] : ");
                answer = console.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while(!answer.equals("no"));

    }
}