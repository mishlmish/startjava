package com.startjava.lesson_1.base;

class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        int age = 25;

        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else { 
            System.out.println("Возраст - не старше 20 лет");
        }

        boolean male = true;

        if (!male) {
            System.out.println("женщина");
        }

        float height = 1.85F;

        if (height < 1.80) {
            System.out.println("рост меньше 1 м. 80 см.");
        } else {
            System.out.println("рост больше 1 м. 80 см.");
        }

        char firstNameLetter = "Alex".charAt(0);

        if (firstNameLetter == 'M') {
            System.out.println("имя начинается на букву M");
        } else if (firstNameLetter == 'I') {
            System.out.println("имя начинается на букву I");
        } else {
            System.out.println("имя не начинается ни на букву М, ни на букву I");
        }

        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа\n");

        int num1 = 125;
        int num2 = 1247;

        if (num1 > num2) {
            System.out.println("Из " + num1 + " и " + num2 + " максимальное " + num1 +
                     ", минимальное "+ num2);
        } else {
            System.out.println("Из " + num1 + " и " + num2 + " максимальное " + num2 +
                     ", минимальное "+ num1);
        }

        //3. Работа с числом
        System.out.println("\n3. Работа с числом\n");

        int srcNum = 135;

        if (srcNum % 2 == 0) {
            System.out.println("Число " + srcNum + " чётное");
        } else {
            System.out.println("Число " + srcNum + " нечётное");
        }

        if (srcNum > 0) {
            System.out.println("Число " + srcNum + " положительное");
        } else if (srcNum < 0) {
            System.out.println("Число " + srcNum + " отрицательное");
        } else {
            System.out.println("Число " + srcNum + " равно нулю");
        }

        //4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах\n");

        int srcNum1 = 895;
        int firstDigit1 = srcNum1 / 100;
        int firstDigit2 = (srcNum1 % 100) / 10;
        int firstDigit3 = (srcNum1 % 100) % 10;

        int srcNum2 = 193;
        int secondDigit1 = srcNum2 / 100;
        int secondDigit2 = (srcNum2 % 100) / 10;
        int secondDigit3 = (srcNum2 % 100) % 10;

        if (firstDigit1 == secondDigit1) {
            System.out.print("В старшем разряде чисел " + srcNum1);
            System.out.println(" и " + srcNum2 + " цифра " + firstDigit1 + " совпадает "); 
        }

        if (firstDigit2 == secondDigit2) {
            System.out.print("В среднем разряде чисел " + srcNum1);
            System.out.println(" и " + srcNum2 + " цифра " + firstDigit2 + " совпадает "); 
        }

        if (firstDigit3 == secondDigit3) {
            System.out.print("В младшем разряде чисел " + srcNum1);
            System.out.println(" и " + srcNum2 + " цифра " + firstDigit3 + " совпадает "); 
        }

        if (firstDigit1 != secondDigit1 && firstDigit2 != secondDigit2 && firstDigit3 != secondDigit3) {
            System.out.print("У чисел " + srcNum1 + " и " + srcNum2 + " нет совпадающих цифр" +
                    " ни в одном разряде");
        }

        //5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");

        char charCode = '\u005A';

        if (charCode > 64 && charCode < 91) {
            System.out.println("Символ " + charCode + " является большой буквой");
        } else if (charCode > 96 && charCode < 123) {
            System.out.println("Символ " + charCode + " является маленькой буквой");
        } else if (charCode > 47 && charCode < 58) {
            System.out.println("Символ " + charCode + " является числом");
        } else {
            System.out.println("Символ " + charCode + " не является ни буквой, ни числом");
        }

        //6. Определение суммы вклада и начисленных банком процентов
        System.out.println("\n6. Определение суммы вклада и начисленных банком процентов\n");

        float investAmount = 300000;
        float interestRate;
        float totalSum;

        if (investAmount < 100000) {
            interestRate = 0.05f;
        } else if (investAmount >= 100000 && investAmount <= 300000) {
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
        int annualProfit = (monthIncome - monthRent - monthCost) * 12;

        if (annualProfit >= 0) {
            System.out.println("За год получена прибыль в размере +" + annualProfit + "р");
        } else {
            System.out.println("За год получен убыток в размере " + annualProfit + "р");
        }

        //9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");

        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int hypot;
        int cathet1;
        int cathet2;
        boolean isPlus = sideA > 0 && sideB > 0 && sideC > 0;;

        if (sideA > sideB && sideA > sideC) {
            hypot = sideA;
            cathet1 = sideB;
            cathet2 = sideC;
        } else if (sideB > sideA && sideB > sideC ) {
            hypot = sideB;
            cathet1 = sideA;
            cathet2 = sideC;
        } else {
            hypot = sideC;
            cathet1 = sideA;
            cathet2 = sideB;
        }

        if (hypot * hypot == cathet1 * cathet1 + cathet2 * cathet2 && isPlus) {
            System.out.println("\nТреугольник со сторонами " + sideA +" , " + sideB + " , " + 
                    sideC + " существует");
            System.out.printf("гипотенуза равна %d", hypot);
            System.out.printf("\nкатеты равны %d и %d", cathet1, cathet2);
            System.out.printf("\nплощадь равна %d \n", cathet1 * cathet2 / 2);

            System.out.print(" ");

            for (int i = 0; i < cathet2; i++) {
                System.out.print("_");
            }

            System.out.println();

            for (int j = cathet1; j > 0; j--) {
                System.out.print("|");
                for (int k = 1 ; k < j * cathet2 / cathet1 ; k++) {
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