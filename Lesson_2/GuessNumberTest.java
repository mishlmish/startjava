import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "cp866");
        String answer;

        do {
            System.out.println("\nВведите имя первого игрока");
            Player player1 = new Player(console.nextLine());

            System.out.println("\nВведите имя второго игрока");
            Player player2 = new Player(console.nextLine());

            GuessNumber game = new GuessNumber(player1, player2);
            game.launch();

            do {
                System.out.println("\nХотите играть ещё? [yes/no] : ");
                answer = console.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
            console.nextLine();
        } while(!answer.equals("no"));
    }
}