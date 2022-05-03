import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int toNum = 100;
    private Player player1;
    private Player player2;
    private Random randomNum = new Random();
    private Scanner console = new Scanner(System.in, "cp866"); 

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        int randomNumber = randomNum.nextInt(toNum) + 1;
        Player currentPlayer = player2;

        while (true) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;

            System.out.println("\nИгрок " + currentPlayer.getName() + " введите число: ");
            currentPlayer.setNumber(console.nextInt());

            if(currentPlayer.getNumber() == randomNumber) {
                System.out.println("\nПобедивший игрок: " + currentPlayer.getName());
                System.out.println("Угадано число: " + currentPlayer.getNumber());
                break;
            }
            if(currentPlayer.getNumber() > randomNumber) {
                System.out.println("\nДанное число " + currentPlayer.getNumber() +
                        " больше, чем загадал компьютер\n");
            } else {
                System.out.println("\nДанное число " + currentPlayer.getNumber() +
                        " меньше, чем загадал компьютер\n");
            }
        }
    }
}
