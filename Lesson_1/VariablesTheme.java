class VariablesTheme {
    
    public static void main(String[] args) {
        //1. Создание переменных и вывод их значений на консоль.
        System.out.println("1. Создание переменных и вывод их значений на консоль");

        byte b = 32;
        short sh = 650;
        int i = 1_304;
        Long lon = 28_350_556l;
        float fl = 693.4f;
        double d = 3.328_12e3;
        double d1 = 3328.12d;
        char ch = 'a';
        boolean logical = true;

        System.out.println("b = " + b);
        System.out.println("sh = " + sh);
        System.out.println("i = " + i);
        System.out.println("lon = " + lon);
        System.out.println("fl = " + fl);
        System.out.println("d = " + d);
        System.out.println("d1 = " + d1 );
        System.out.println("ch = " + ch);
        System.out.println("logical = " + logical);
        System.out.println();

        //2. Расчет стоимости товара со скидкой.
        System.out.println("2. Расчет стоимости товара со скидкой");
        float x = 100f;
        float y = 200f;
        float discRate = 11f;
        float discount = ( x + y )*discRate/100;
        float totalSum = x + y - discount;

        System.out.printf("Сумма скидки = "+ "%.2f" ,discount);
        System.out.println();
        System.out.printf("Общая стоимость товаров со скидкой = " + "%.2f" ,totalSum);
        System.out.println();
        System.out.println();

        //3. Вывод на консоль слова Java
        System.out.println("3. Вывод на консоль слова Java");
        System.out.println();

        System.out.println("               " + "   J " + "   a  " + "v" + "     " + "v" + "  a   ");
        System.out.println("               " + "   J " + "  a a " + " " + "v   v" + " " + " a a  ");
        System.out.println("               " + "J  J " + " aaaaa" + " " + " V V " + " " + "aaaaa ");
        System.out.println("               " + " JJ  " + "a     " + "a" + "  V  " + "a" + "     a");
        System.out.println();

        //4. Отображение min и max значений целых числовых типов данных
        System.out.println("4. Отображение min и max значений целых числовых типов данных");

        byte b1 = 127;
        short sh1 = 32_767;
        int i1 = 2_147_483_647;
        long lng = 9_223_372_036_854_775_807L;
        char ch1 = 65_535;

        
        
        
        
        

        System.out.println("b1 = " + b1);
        System.out.println("sh1 = " + sh1);
        System.out.println("i1 = " + i1);
        System.out.println("lng = " + lng);
        System.out.println("ch1 = " + ch1);
        System.out.println();

        b1 +=1;
        sh1 +=1;
        i1 +=1;
        lng +=1;
        ch1 +=1;

        System.out.println("    Увеличение значений переменных на единицу");
        System.out.println("b1 = " + b1);
        System.out.println("sh1 = " + sh1);
        System.out.println("i1 = " + i1);
        System.out.println("ln1 = " + lng);
        System.out.println("ch1 = " + ch1);
        System.out.println();

        b1 -=1;
        sh1 -=1;
        i1 -=1;
        lng -=1;
        ch1 -=1;

        System.out.println("    Уменьшение значений переменных на единицу");
        System.out.println("b1 = " + b1);
        System.out.println("sh1 = " + sh1);
        System.out.println("i1 = " + i1);
        System.out.println("ln1 = " + lng);
        System.out.println("ch1 = " + ch1);
        System.out.println();

        //5. Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных");
        System.out.println();

        float a = 3.1415F;
        float bb = 6.01e23F;

        System.out.println("    a =  " + a + ", bb = " + bb);
        System.out.println();

        float c = a;
        a = bb;
        bb = c;

        System.out.println("    Новые значения переменных: a = " + a + ", bb = " + bb);
        System.out.println();

        //6. Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов");
        System.out.println();

        int var1 = 35;
        int var2 = 38;
        int var3 = 64;
        int var4 = 94;
        int var5 = 95;

        char char1 = (char) var1;
        char char2 = (char) var2;
        char char3 = (char) var3;
        char char4 = (char) var4;
        char char5 = (char) var5;

        System.out.println("Коду " + var1 + " соответствует символ  " + char1 );
        System.out.println("Коду " + var2 + " соответствует символ  " + char2 );
        System.out.println("Коду " + var3 + " соответствует символ  " + char3 );
        System.out.println("Коду " + var4 + " соответствует символ  " + char4 );
        System.out.println("Коду " + var5 + " соответствует символ  " + char5 );
        System.out.println();

        //7. Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа");
        System.out.println();

        int num = 345;
        int numBig = num / 100;
        int numMiddle = (num - numBig*100) / 10; 
        int numKid = num - numBig * 100 - numMiddle * 10;

        int digitsProduct = numKid * numMiddle * numBig;
        int digitsSum = numKid + numMiddle + numBig;

        System.out.println("Произведение цифр числа " + num + " равно " + digitsProduct);
        System.out.println("Сумма цифр числа " + num + " равна " + digitsSum);
        System.out.println();

        //8. Вывод на консоль ASCII - арт Дюка
        System.out.println("8. Вывод на консоль ASCII - арт Дюка");
        System.out.println();

        char sp = ' ';
        char sl = '/';
        char bkSl = '\\';
        char unSt = '_';
        char opBr = '(';
        char clBr = ')';

        System.out.print("             ");
        System.out.println(" " + sp + sp + sp + sp + sl + bkSl + sp + sp + sp + sp);
        System.out.print("             ");
        System.out.println(" " + sp + sp + sp + sl + sp + sp +bkSl + sp + sp + sp);
        System.out.print("             ");
        System.out.println(" " + sp + sp + sl + unSt + opBr + sp + clBr +bkSl + sp + sp);
        System.out.print("             ");
        System.out.println(" " + sp + sl + sp + sp + sp + sp + sp + sp +bkSl + sp);
        System.out.print("             ");
        System.out.println(" " + sl + unSt + unSt + unSt + unSt + sl + bkSl + unSt + unSt +bkSl);
        System.out.println();

        //9. Отображение количества сотен, десятков и единиц числа
        System.out.println("9. Отображение количества сотен, десятков и единиц числа");
        System.out.println();

        int numb = 123;
        int digit3 = numb % 10;
        int digit2 = (numb % 100) / 10;
        int digit1 = numb / 100;

        System.out.println("Количество единиц в числе " + numb + " : " + digit3);
        System.out.println("Количество десятков  : " + digit2);
        System.out.println("Количество сотен  : " + digit1);
        System.out.println();

        //10. Преобразование секунд
        System.out.println("10. Преобразование секунд");
        System.out.println();

        int num3 = 86399;
        int hours = num3 / 3600;
        int seconds = num3 % 60;
        int minutes = (num3 % 3600) /60;

        System.out.println("" + num3 + " секунд - это " + hours + ":" + minutes + ":" + seconds);


    }
}