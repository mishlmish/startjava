class MyFirstGame {
    public static void main(String[] args) {
        //2. Игра "Угадай число"
        System.out.println("\n2. Игра \"Угадай число\"\n");

        int fromNum = 0;
        int toNum = 101;
        int compNum = 46;
        int playerNum = 47;
        int tempMin = fromNum;
        int tempMax = toNum;

        if (playerNum == compNum) {
            System.out.println("Вы победили! Отгаданное число: " + playerNum);
        } else {
        System.out.println("Начальное число игрока: " + playerNum);
        
        while (playerNum != compNum) {
        if (playerNum < compNum) {
            System.out.println("Новое число игрока: " + playerNum + " меньше загаданного");
            tempMin = playerNum;
            playerNum = (tempMin + tempMax ) / 2;
        } else {
            System.out.println("Новое число игрока: " + playerNum + " больше загаданного");
            tempMax = playerNum;
            playerNum = (tempMin + tempMax ) / 2;
        }
        }
        System.out.println("Вы победили! Отгаданное число: " + playerNum);
        }
    }
}