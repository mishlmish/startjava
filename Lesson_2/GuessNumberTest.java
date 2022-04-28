import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");

        while(true) {
            System.out.println("\nВведите имя первого игрока");
            Player player1 = new Player(scanner.nextLine());

            System.out.println("\nВведите имя второго игрока");
            Player player2 = new Player(scanner.nextLine());
            GuessNumber guessNumber = new GuessNumber(player1, player2);

            guessNumber.compareNumbers();

            String answer;

            do {
                System.out.println("\nХотите играть ещё? [yes/no] : ");
                answer = scanner.next();
            } while(!answer.equals("yes") && !answer.equals("no"));

            if(answer.equals("no")) {
                break;
            }
        scanner.nextLine();
        } 
    }
}