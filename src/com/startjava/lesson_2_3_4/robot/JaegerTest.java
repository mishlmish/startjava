package com.startjava.lesson_2_3_4.robot;

class JaegerTest {

    public static void main(String[] args) {
        Jaeger ja1 = new Jaeger("Coyote Tango","Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);
        Jaeger ja2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 9, 8, 6);

        System.out.println("Первый робот");

        ja1.giveInfo();

        System.out.println("\nАпгрейд брони и скорости\n");

        ja1.setArmor(ja1.getArmor() + 1);
        ja1.setSpeed(ja1.getSpeed() + 1);

        ja1.giveInfo();

        System.out.println("\nВторой робот\n");

        ja2.giveInfo();

        System.out.println("\nЧастичная деградация с понижением силы\n");

        ja2.setStrength(ja2.getStrength() - 1);

        ja2.giveInfo();
    }
}