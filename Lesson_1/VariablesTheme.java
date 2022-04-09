class VariablesTheme {
    
    public static void main(String[] args) {
        //1. Создание переменных и вывод их значений на консоль.
        System.out.println("\n1. Создание переменных и вывод их значений на консоль \n");

        byte cache = 32;
        short stepping = 5;
        int multiplier = 1_304;
        Long freeHdMemo = 51_540_357_120l;
        float coreSpeed = 3328.12f;
        double qpiLink = 3328.12d;
        char rev = 'a';
        boolean locked = true;

        System.out.println("cache = " + cache);
        System.out.println("stepping = " + stepping);
        System.out.println("multiplier = " + multiplier);
        System.out.println("freeHdMemo = " + freeHdMemo);
        System.out.println("coreSpeed = " + coreSpeed);
        System.out.println("qpiLink = " + qpiLink);
        System.out.println("rev = " + rev);
        System.out.println("locked = " + locked);

        //2. Расчет стоимости товара со скидкой.
        System.out.println("\n2. Расчет стоимости товара со скидкой");

        float coffePrice = 100f;
        float chocPrice = 200f;
        float discRate = 0.11f;
        float discount = (coffePrice + chocPrice) * discRate;
        float totalSum = coffePrice + chocPrice - discount;

        System.out.printf("\nСумма скидки = %.2f \n", discount);
        System.out.printf("Общая стоимость товаров со скидкой = %.2f \n", totalSum);

        //3. Вывод на консоль слова Java
        System.out.println("\n3. Вывод на консоль слова Java");

        System.out.printf("\n%14s", " ");
        System.out.println("   J " + "   a  " + "v" + "     " + "v" + "  a   ");
        System.out.printf("%14s", " ");
        System.out.println("   J " + "  a a " + " " + "v   v" + " " + " a a  ");
        System.out.printf("%14s", " ");
        System.out.println("J  J " + " aaaaa" + " " + " V V " + " " + "aaaaa ");
        System.out.printf("%14s", " ");
        System.out.println(" JJ  " + "a     " + "a" + "  V  " + "a" + "     a");

        //4. Отображение min и max значений целых числовых типов данных
        System.out.println("\n4. Отображение min и max значений целых числовых типов данных\n");

        byte maxBite = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        char maxChar = 65_535;     

        System.out.println("\nmaxBite = " + maxBite);
        System.out.println("maxShort = " + maxShort);
        System.out.println("maxInt = " + maxInt);
        System.out.println("maxLong = " + maxLong);
        System.out.println("maxChar = " + maxChar);

        System.out.println("\nУвеличение значений переменных на единицу\n");
        System.out.println("maxBite = " + ++maxBite);
        System.out.println("maxShort = " + ++maxShort);
        System.out.println("maxInt = " + ++maxInt);
        System.out.println("maxLong = " + ++maxLong);
        System.out.println("maxChar = " + ++maxChar);

        System.out.println("\nУменьшение значений переменных на единицу\n");
        System.out.println("maxBite = " + --maxBite);
        System.out.println("maxShort = " + --maxShort);
        System.out.println("maxInt = " + --maxInt);
        System.out.println("maxLong = " + --maxLong);
        System.out.println("maxChar = " + --maxChar);

        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных\n");

        float num1 = 3.1415F;
        float num2 = 6.01e23F;

        System.out.println("num1 =  " + num1 + ", num2 = " + num2);

        float tempNum = num1;
        num1 = num2;
        num2 = tempNum;

        System.out.println("\nНовые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        //6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");

        int hashCode = 35;
        int ampCode = 38;
        int atCode = 64;
        int caretCode = 94;
        int undlnCode = 95;

        System.out.println("\nКоду " + hashCode + " соответствует символ  " + (char) hashCode);
        System.out.println("Коду " + ampCode + " соответствует символ  " + (char) ampCode);
        System.out.println("Коду " + atCode + " соответствует символ  " + (char) atCode);
        System.out.println("Коду " + caretCode + " соответствует символ  " + (char) caretCode);
        System.out.println("Коду " + undlnCode + " соответствует символ  " + (char) undlnCode);

        //7. Произведение и сумма цифр числа
        System.out.println("\n7. Произведение и сумма цифр числа");

        int srcNum = 345;
        int numBig = srcNum / 100;
        int numMiddle = (srcNum % 100) / 10; 
        int numKid = srcNum % 10;

        int productDigits = numKid * numMiddle * numBig;
        int sumDigits = numKid + numMiddle + numBig;

        System.out.println("\nПроизведение цифр числа " + srcNum + " равно " + productDigits);
        System.out.println("Сумма цифр числа " + srcNum + " равна " + sumDigits);

        //8. Вывод на консоль ASCII - арт Дюка
        System.out.println("\n8. Вывод на консоль ASCII - арт Дюка\n");

        char sp = ' ';
        char sl = '/';
        char bksl = '\\';
        char unln = '_';
        char opBr = '(';
        char clBr = ')';

        System.out.printf("%13s", " ");
        System.out.println(" " + sp + sp + sp + sp + sl + bksl + sp + sp + sp + sp);
        System.out.printf("%13s", " ");
        System.out.println(" " + sp + sp + sp + sl + sp + sp +bksl + sp + sp + sp);
        System.out.printf("%13s", " ");
        System.out.println(" " + sp + sp + sl + unln + opBr + sp + clBr +bksl + sp + sp);
        System.out.printf("%13s", " ");
        System.out.println(" " + sp + sl + sp + sp + sp + sp + sp + sp +bksl + sp);
        System.out.printf("%13s", " ");
        System.out.println(" " + sl + unln + unln + unln + unln + sl + bksl + unln + unln + bksl);

        //9. Отображение количества сотен, десятков и единиц числа
        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");

        srcNum = 123;
        int digit3 = srcNum % 10;
        int digit2 = (srcNum % 100) / 10;
        int digit1 = srcNum / 100;

        System.out.println("\nКоличество единиц в числе " + srcNum + " : " + digit3);
        System.out.println("Количество десятков : " + digit2);
        System.out.println("Количество сотен : " + digit1);

        //10. Преобразование секунд
        System.out.println("\n10. Преобразование секунд");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("\n" + totalSeconds + " секунд - это " 
                + hours + ":" + minutes + ":" + seconds);
    }
}