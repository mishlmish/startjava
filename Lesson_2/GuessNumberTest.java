import java.util.Scanner;
import java.util.Random;

class GuessNumberTest {
    public static void main(String[] args) {
    int tempNumber;
    int fromNum = 1;
    int toNum = 100;
    boolean playing = true;
    boolean playingMore = true;

    Random randomNum = new Random();

    Scanner scanner = new Scanner(System.in);

    do {

        Player tempPlayer = new Player();

        int randomNumber = randomNum.nextInt(toNum - fromNum) + fromNum;

        GuessNumber guessNumber = new GuessNumber(randomNumber);

        System.out.println("\nВведите имя первого игрока");

        Player player1 = new Player(scanner.nextLine());

        System.out.println("\nВведите имя второго игрока");

        Player player2 = new Player(scanner.nextLine());

        int counter = 1;

        do {
            if(counter % 2 == 1) {
                tempPlayer = player1;
            } else {
                tempPlayer = player2;
            }

            counter++;

            System.out.println("\nИгрок " + tempPlayer.getName() + " введите число: ");

            guessNumber.setPlayerNum(scanner.nextInt());

            playing = guessNumber.playAndWin();

            if(!playing) {
                System.out.println("\nПобедивший игрок: " + tempPlayer.getName());
            }

            } while (playing);

        boolean moreAsking = true;

        do {
            System.out.println("\nХотите играть ещё? [yes/no] : ");
            String answer = scanner.next();

            if(answer.charAt(0) == 'y' && answer.charAt(1) == 'e' && answer.charAt(2) == 's') {
                playingMore = true;
                moreAsking = false;
            } else if(answer.charAt(0) == 'n' && answer.charAt(1) == 'o') {
                playingMore = false;
                moreAsking = false;
            } else {
                moreAsking = true;
            }
        } while(moreAsking);
        scanner.nextLine();
    } while(playingMore);
    }
}