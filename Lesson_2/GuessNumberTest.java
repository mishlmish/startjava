import java.util.Scanner;
import java.util.Random;

class GuessNumberTest {
    public static void main(String[] args) {
    int fromNum = 1;
    int toNum = 100;
    boolean playing = true;
    boolean playingMore = true;
    Random randomNum = new Random();
    Scanner scanner = new Scanner(System.in);

    do {
        String tempPlayerName;
        int randomNumber = randomNum.nextInt(toNum - fromNum) + fromNum;
        Player compPlayer = new Player("Computer", randomNumber);

        System.out.println("\nВведите имя первого игрока");
        String player1Name = scanner.nextLine();

        System.out.println("\nВведите имя второго игрока");
        String player2Name = scanner.nextLine();

        int counter = 1;

        do {
            if(counter % 2 == 1) {
                tempPlayerName = player1Name;
            } else {
                tempPlayerName = player2Name;
            }

            counter++;

            System.out.println("\nИгрок " + tempPlayerName + " введите число: ");
            
            Player tempPlayer = new Player(tempPlayerName, scanner.nextInt());
            GuessNumber guessNumber = new GuessNumber(compPlayer, tempPlayer);

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