class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int fromNum = -10;
        int toNum = 21;
        int counter = fromNum;
        int sumOdd = 0;
        int sumEven = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= toNum);

        System.out.println("\nСумма четных чисел от " + fromNum + " до " + toNum +
                " равна " + sumEven);
        System.out.println("Сумма нечетных чисел от " + fromNum + " до " + toNum + " равна " +
                sumOdd);

        //2. Вывод чисел между min  и max
        System.out.println("\n2. Вывод чисел между min  и max");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num2;

        if (num1 >= num2 && num1 >= num3) {
            maxNum = num1;

            if (num3 < num2) {
                minNum = num3;
            } else {
                minNum = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maxNum = num2;

            if (num3 < num1) {
                minNum = num3;
            } else {
                minNum = num1;
            }
        } else  if (num3 >= num1 && num3 >= num2) {
            maxNum = num3;

            if (num3 < num2) {
                minNum = num3;
            } else {
                minNum = num2;
            }
        }

        System.out.print("\nВсе числа между " + minNum + " до " + maxNum+ " :   ");

        for (int i = minNum + 1; i < maxNum; i++) {
            System.out.print(i + "  ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;
        int sum = srcNum % 10;
        int tempNum = srcNum; 
        int inversNum = (srcNum % 10) * 1000 ;
        int decMultiplier = 1000;

        while (tempNum > 0) {
            tempNum = tempNum / 10;
            sum = sum + tempNum % 10;
            decMultiplier = decMultiplier / 10;
            inversNum = inversNum + (tempNum % 10) * decMultiplier;
        }

        System.out.println("\nЧисло " + srcNum + " в обратном порядке будет числом: " + inversNum +
                " , сумма его цифр: " + sum);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        fromNum = 1;
        toNum = 24;
        int zeroNum = (5 - ((toNum - fromNum + 1) / 2) % 5) * 2;

        for (int i = fromNum; i < toNum + zeroNum; i += 2) {
            if (i < toNum) {
                if ((i - fromNum) % 10 != 8){
                    System.out.printf("%s%3d", "   ", i);
                } else {
                    System.out.printf("%s%3d\n", "   ", i);
                }
            } else {
                if (zeroNum != 10) {
                System.out.printf("%s%3d", "   ", 0);
                                }
            }
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");

        srcNum = 3141591;
        tempNum = srcNum;
        int numOfOnes = 0;

        while (tempNum > 0) {
            if (tempNum % 10 == 1) {
                numOfOnes++;
            }

            tempNum /= 10;
        }

        System.out.print("\nКоличество единиц в числе " + srcNum + " : " + numOfOnes + " , ");
        if (numOfOnes % 2 == 0) {
            System.out.println("это число четное");
        } else {
            System.out.println("это число нечетное");
        }

        //6. Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли");

        //Квадрат
        int hight = 5;

            while (hight > 0) {
            int width = 10;

            System.out.printf("\n%10s", " ");
            while (width > 0) {
                System.out.print("*");
                width--;
            }
            hight--;
        }

        //Прямоугольный треугольник
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.printf("\n%10s", " ");
            for (int j = 5; j > i; j--) {
                System.out.print("#");
            }
        }

        //Треугольник
        int lengthProfile = 12321;

        System.out.println();

        do {
            int columNum = lengthProfile % 10;

            System.out.printf("\n%10s", " ");
            do {
                System.out.printf("%s", "$");
            } while (columNum-- > 1);

            lengthProfile = lengthProfile / 10;
        } while (lengthProfile > 0);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");

        System.out.printf("\n%6s%s", " ", "Code Char");

        for (int i = 1; i < 128; i += 2) {
            System.out.printf("\n%5s%4d%5c", " ", i, (char) i);
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n\n8. Проверка, является ли число палиндромом");

        srcNum = 12321;
        tempNum = srcNum;
        int digitNum = 0;

        while (tempNum > 0) {
            tempNum = tempNum / 10;
            digitNum++;
        }

        decMultiplier = 1;

       for (int i = 1; i < digitNum; i++) {
            decMultiplier *=10;
        }

        tempNum = srcNum;
        inversNum = 0;

        for (int j = 0; j < digitNum; j++) {
            inversNum += (tempNum % 10) * decMultiplier;
            decMultiplier /= 10;
            tempNum /= 10;
        }

        if (srcNum == inversNum) {
            System.out.println("\nЧисло " + srcNum + " является палиндромом");
        } else {
            System.out.println("\nЧисло " + srcNum + " не является палиндромом");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым\n");

        srcNum = 356841;
        int leftDigits = srcNum / 1000;
        int rigthDigits = srcNum % 1000;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < 3; i++) {
            leftSum += leftDigits % 10;
            leftDigits /= 10;
            rightSum += rigthDigits % 10;
            rigthDigits /= 10;
        }

        leftDigits = srcNum / 1000;
        rigthDigits = srcNum % 1000;

        System.out.println("В числе " + srcNum + " сумма цифр первой тройки " + leftDigits +
                " = " + leftSum);
        System.out.println("сумма цифр второй тройки " + rigthDigits +
                " = " + rightSum);

        if (leftSum == rightSum) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число не является счастливым");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        System.out.println("\n    ТАБЛИЦА  ПИФАГОРА\n");
        System.out.println("   |   2   3   4   5   6   7   8   9");
        
        for (int i = 1; i < 37; i++) {
            System.out.printf("%c", 22);
        }

        System.out.println();

        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d%s%4d%4d%4d%4d%4d%4d%4d%4d\n", i , " |", i * 2 , i * 3, i * 4, +
                    i * 5, i * 6, i * 7, i * 8, i * 9);
        }
    }
}