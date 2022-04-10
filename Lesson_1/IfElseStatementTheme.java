class IfElseStatementTheme {

    public static void main(String[] args) {
        
        //1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        int age = 25;
        boolean male = true;
        float height = 1.85F;
        char[] name = { 'A' , 'l' , 'e' , 'x'};

        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else { 
            System.out.println("Возраст - не старше 20 лет");
        }

        if (!male) {
            System.out.println("женщина");
        }

        if (height < 1.80) {
            System.out.println("рост меньше 1 м. 80 см.");
        } else {
            System.out.println("рост больше 1 м. 80 см.");
        }

        if (name[0] == 'M') {
            System.out.println("имя начинается на букву M");
        } else if (name[0] == 'I') {
            System.out.println("имя начинается на букву I");
        } else {
            System.out.println("имя не начинается ни на букву М, ни на букву I");
        }

        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа\n");

        int int1 = 125;
        int int2 = 1247;

        if ( int1 > int2) {
            System.out.println("Из " + int1 + " и " + int2 + " максимальное " + int1 +
                     ", минимальное "+ int2);
        } else {
            System.out.println("Из " + int1 + " и " + int2 + " максимальное " + int2 +
                     ", минимальное "+ int1);
        }

        //3. Работа с числом
        System.out.println("\n3. Работа с числом\n");

        int srcNum = 135;
        boolean isEvenNumber = srcNum % 2 == 0;

        if (isEvenNumber == false) {
            System.out.println("Число " + srcNum + " чётное");
        } else {
            System.out.println("Число " + srcNum + " нечётное");
        }

        if (srcNum > 0) {
            System.out.println("Число " + srcNum + " положительное");
        } else if (srcNum != 0) {
            System.out.println("Число " + srcNum + " отрицательное");
        } else {
            System.out.println("Число " + srcNum + " равно нулю");
        }

        //4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах\n");

        int firstNum = 895;
        int firstNum1 = firstNum / 100;
        int firstNum2 = (firstNum % 100) / 10;
        int firstNum3 = (firstNum % 100) % 10;

        int secondNum = 193;
        int secondNum1 = secondNum / 100;
        int secondNum2 = (secondNum % 100) / 10;
        int secondNum3 = (secondNum % 100) % 10;

        if (firstNum1 == secondNum1) {
            System.out.print("В старшем разряде чисел " + firstNum);
            System.out.println(" и " + secondNum + " цифра " + firstNum1 + " совпадает "); 
        }

        if (firstNum2 == secondNum2) {
            System.out.print("В среднем разряде чисел " + firstNum);
            System.out.println(" и " + secondNum + " цифра " + firstNum2 + " совпадает "); 
        }

        if (firstNum3 == secondNum3) {
            System.out.print("В младшем разряде чисел " + firstNum);
            System.out.println(" и " + secondNum + " цифра " + firstNum3 + " совпадает "); 
        }

        if (firstNum1 != secondNum1 & firstNum2 != secondNum2 & firstNum3 != secondNum3) {
            System.out.print("У чисел " + firstNum + " и " + secondNum + " нет совпадающих цифр" +
                    " ни в одном разряде");
        }

        //5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        System.out.println();

        char ch = '\u005A';
        int chint = ch;

        if (chint > 64 & chint < 91) {
            System.out.println("Символ " + ch + " является большой буквой");
        } else if (chint > 96 & chint < 123) {
            System.out.println("Символ " + ch + " является маленькой буквой");
        } else if (chint > 47 & chint < 58) {
            System.out.println("Символ " + ch + " является числом");
        } else {
            System.out.println("Символ " + ch + " не является ни буквой, ни числом");
        }

        //6. Определение суммы вклада и начисленных банком процентов
        System.out.println("\n6. Определение суммы вклада и начисленных банком процентов\n");

        float investAmount = 300000;
        float interestRate;
        float totalSum;

        if (investAmount < 100000) {
            interestRate = 0.05f;
        } else if (investAmount >= 100000 & investAmount <= 300000) {
            interestRate = 0.07f;
        } else {
            interestRate = 0.1f;
        }

        System.out.printf("Сумма вклада: %.2f \n", investAmount);
        System.out.printf("Начисленный процент: %.2f \n",  investAmount * interestRate);
        System.out.printf("Итоговая сумма: %.2f \n", investAmount + investAmount * interestRate);

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");

        float histRate = 59f;
        float progRate = 91f;
        float histMark;
        float progMark;

        if (histRate <= 60) {
            histMark = 2;
        } else if (histRate <= 73) {
            histMark = 3;
        } else if (histRate <= 91) {
            histMark = 4;
        } else {
            histMark = 5;
        }

        if (progRate <= 60) {
            progMark = 2;
        } else if (progRate <= 73) {
            progMark = 3;
        } else if (progRate <= 91) {
            progMark = 4;
        } else {
            progMark = 5;
        }

        System.out.printf("\n%.0f %5s %s", histMark, " ", "Оценка по истории");
        System.out.printf("\n%.0f %5s %s\n", progMark, " ", "Оценка по программированию");
        System.out.printf("%.1f %3s Средний бал оценок\n", (histMark + progMark) / 2, " ");
        System.out.printf("%.1f%% %s Средний %% по предметам\n", (histRate + progRate) / 2, " ");

        // Расчет прибыли (убытка)
        System.out.println("\nРасчет прибыли (убытка)");
        
        int monthRent = 5000;
        int monthIncome = 15000;
        int monthCost = 9000;

        if (monthIncome - monthRent - monthCost >= 0) {
            System.out.println("За год получена прибыль в размере +" +
                    (monthIncome - monthRent - monthCost)*12 + "р");
        } else {
            System.out.println("За год получен убыток в размере " +
                    (monthIncome - monthRent - monthCost)*12 + "р");
        }

        //9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");

        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int hypot;
        int cathet1;
        int cathet2;
        boolean isPlus = sideA > 0 & sideB > 0 & sideC > 0;;

        if (sideA >= sideB & sideA >= sideC) {
            hypot = sideA;
            cathet1 = sideB;
            cathet2 = sideC;
        } else if (sideB >= sideA & sideB >= sideC ) {
            hypot = sideB;
            cathet1 = sideA;
            cathet2 = sideC;
        } else {
            hypot = sideC;
            cathet1 = sideA;
            cathet2 = sideB;
        }

        if (hypot * hypot == cathet1 * cathet1 + cathet2 * cathet2 & isPlus) {
            System.out.println("\nТреугольник со сторонами " + sideA +" , " + sideB + " , " + 
                    sideC + " существует");
            System.out.printf("гипотенуза равна %d", hypot);
            System.out.printf("\nкатеты равны %d и %d", cathet1, cathet2);
            System.out.printf("\nплощадь равна %d \n", cathet1 * cathet2 / 2);

            System.out.print(" ");

            for (int i = 0; i< cathet2; i++) {
                System.out.print("_");
            }

            System.out.println();

            for (int j = cathet1; j >= 0; j--) {
                System.out.print("|");
                for (int k = 0 ; k < j * cathet2 / cathet1 ; k++) {
                    System.out.print(" ");
            }

                System.out.println("/");
            }

        } else {
            System.out.println("\n Прямоугольного треугольник со сторонами " + sideA +" , " + 
                    sideB + " , " + sideC + " не существует");
        }

        //10. Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот");

        int sum = 567;
        int oneRubNum = sum % 10;
        int tenRubNum = (sum % 50) / 10;
        int fiftyRubNum = sum / 50;

        System.out.println("\nСумму в " + sum + " можно получить банкнотами : " +
                fiftyRubNum + " по 50 , " + tenRubNum + " по 10 и " +
                oneRubNum + " по 1" );
        System.out.println("Проверка: " + fiftyRubNum + " * 50 " + " + " + tenRubNum + " * 10 " +
                " + " + oneRubNum + " * 1 = " + (fiftyRubNum*50 + tenRubNum*10 + oneRubNum));
    }
}