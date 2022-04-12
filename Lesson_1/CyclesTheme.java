class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int fromNum = -10;
        int toNum = 21;
        int number = fromNum;
        int oddNumSum = 0;
        int evenNumSum = 0;

        do {
            if (number % 2 == 0) {
                evenNumSum += number;
            } else {
                oddNumSum += number;
            }
            number++;
        } while (number <= toNum);

        System.out.println("\nСумма четных чисел от " + fromNum + " до " + toNum +
                " равна " + evenNumSum);
        System.out.println("Сумма нечетных чисел от " + fromNum + " до " + toNum + " равна " +
                oddNumSum);

        //2. Вывод чисел между min  и max
        System.out.println("\n2. Вывод чисел между min  и max");

        int var1 = 10;
        int var2 = 5;
        int var3 = -1;
        int maxNum = 0;
        int minNum = 0;

        if (var1 >= var2 && var1 >= var3) {
            maxNum = var1;

            if (var2 >= var3) {
                minNum = var3;
            } else {
                minNum = var2;
            }
        } else if (var2 >= var1 && var2 >= var3) {
            maxNum = var2;

            if (var1 >= var3) {
                minNum = var3;
            } else {
                minNum = var1;
            }
        } else  if (var3 >= var1 && var3 >= var2) {
            maxNum = var3;

            if (var2>= var3) {
                minNum = var3;
            } else {
                minNum = var2;
            }
        }

        System.out.print("\nВсе числа в диапазоне от " + minNum + " до " + maxNum+ " :   ");

        for ( int i = minNum; i <= maxNum; i++) {
            System.out.print("" + i + "  ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;
        int digit1 = -1;
        int digit2 =-1;
        int digit3 = -1;
        int digit4 = -1;
        int tempNum = srcNum; 

        while (tempNum > 0) {
            if (digit1 == -1) {
                digit1 = srcNum % 10;
                tempNum = srcNum / 10;
            } else if (digit2 == -1) {
                digit2 = tempNum % 10;
                tempNum = tempNum / 10;
            } else if (digit3 == -1) {
                digit3 = tempNum % 10;
                tempNum = tempNum / 10;
            } else if (digit4 == -1) {
                digit4 = tempNum % 10;
                tempNum = tempNum / 10;
            }
        }

        int inversNum = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
        System.out.println("\nЧисло " + srcNum + " в обратном порядке будет числом: " + inversNum +
                " , сумма его цифр: " + (digit4 + digit3 + digit2 + digit1));

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int srcLeft = 1;
        int srcRight = 24;

        for (int i = srcLeft - 1; i < (srcRight / 5) + 1; i += 2) {
            System.out.println();
            for (int j = 0 ; j < 10; j += 2) {
                int tempIndex = i * 5 + j + 2;

                if (tempIndex < srcRight) {
                System.out.printf(" %2d", tempIndex);

                } else {
                System.out.printf(" %2d", 0);
                }
            }
            System.out.println();
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n5. Проверка количества единиц на четность");

        srcNum = 3141591;
        tempNum = srcNum;
        int numOfOnes = 0;

        while (tempNum > 0) {

            if (tempNum % 10 == 1) {
            numOfOnes++;
            }

            tempNum = tempNum / 10;
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
        int lengthProfile = 12321 ;

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

        for (int i = 1; i < 128; i +=2) {
            System.out.printf("\n%5s%4d%5c", " ", i, (char) i);
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n\n8. Проверка, является ли число палиндромом");

        srcNum = 12321;

        if (srcNum / 10000 == srcNum % 10 && (srcNum % 10000) / 1000 == (srcNum % 100) / 10) {
            System.out.println("\nЧисло " + srcNum + " является палиндромом");
        } else {
            System.out.println("\nЧисло " + srcNum + " не является палиндромом");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым\n");

        srcNum = 356842;
        int firstThreeNum = srcNum / 1000;
        int secondThreeNum = srcNum % 1000;

        int firstSum = firstThreeNum / 100 + (firstThreeNum % 100) /10 + firstThreeNum % 10;
        int secondSum = secondThreeNum / 100 + (secondThreeNum % 100) /10 + secondThreeNum % 10;

        System.out.println("В числе " + srcNum + " сумма цифр первой тройки " + firstThreeNum +
                " = " + firstSum);
        System.out.println("сумма цифр второй тройки " + secondThreeNum +
                " = " + secondSum);

        if (firstSum == secondSum) {
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
            System.out.printf("%2d%s%4d%4d%4d%4d%4d%4d%4d%4d\n", i , " |", i*2 , i*3, i*4, i*5, +
                    i*6, i*7, i*8, i*9);
        }
    }
}