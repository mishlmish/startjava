import java.util.Scanner;

class GuessNumber {
    private Player compPlayer;
    private Player player;

    public GuessNumber(Player compPlayer, Player player) {
        this.compPlayer = compPlayer;
        this.player = player;
    }

    public boolean playAndWin() {

        if(player.getNumber() > compPlayer.getNumber()) {
            System.out.println("\nДанное число " + player.getNumber() +
                    " больше, чем загадал компьютер\n");

            return true;
        } else if(player.getNumber() < compPlayer.getNumber()) {
            System.out.println("\nДанное число " + player.getNumber() +
                    " меньше, чем загадал компьютер\n");
            return true;
        } else {
            System.out.println("Угадано число: " + player.getNumber());

            return false;
        }
    }
}
