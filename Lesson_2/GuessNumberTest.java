import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        String answer = "not null";

        while(!answer.equals("no")) {
            System.out.println("\nВведите имя первого игрока");
            Player player1 = new Player(scanner.nextLine());

            System.out.println("\nВведите имя второго игрока");
            Player player2 = new Player(scanner.nextLine());

            GuessNumber game = new GuessNumber(player1, player2);
            game.launch();

            do {
                System.out.println("\nХотите играть ещё? [yes/no] : ");
                answer = scanner.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
            scanner.nextLine();
        } 
    }
}