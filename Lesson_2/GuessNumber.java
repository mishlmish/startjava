import java.util.Scanner;

class GuessNumber {
    private int compNum;
    private int playerNum;

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public GuessNumber(int compNum) {
        this.compNum = compNum;
    }

    public boolean playAndWin() {
        
        if(playerNum > compNum) {
            System.out.println("\nДанное число " + playerNum +
                    " больше, чем загадал компьютер\n");

            return true;
        } else if(playerNum < compNum) {
            System.out.println("\nДанное число " + playerNum +
                    " меньше, чем загадал компьютер\n");
            return true;
        } else {
            System.out.println("Угадано число: " + playerNum);

            return false;
        }
    }
}
