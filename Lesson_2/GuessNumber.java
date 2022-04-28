import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int fromNum = 1;
    private int toNum = 100;
    private Player player1;
    private Player player2;
    private Random randomNum = new Random();
    private Scanner scanner = new Scanner(System.in, "cp866"); 

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void compareNumbers() {
        int randomNumber = randomNum.nextInt(toNum - fromNum) + fromNum;
        int counter = 1;
        String playerName;

        while (true) {
            if(counter % 2 == 1) {
                playerName = player1.getName();
            } else {
                playerName = player2.getName();
            }

            counter++;

            System.out.println("\nИгрок " + playerName + " введите число: ");
            int tempNumber = scanner.nextInt();

            if(tempNumber == randomNumber) {
                System.out.println("\nПобедивший игрок: " + playerName);
                System.out.println("Угадано число: " + tempNumber);
                break;
            }
            if(tempNumber > randomNumber) {
                System.out.println("\nДанное число " + tempNumber +
                        " больше, чем загадал компьютер\n");
            } else {
                System.out.println("\nДанное число " + tempNumber +
                        " меньше, чем загадал компьютер\n");
            }
        }
    }
}
