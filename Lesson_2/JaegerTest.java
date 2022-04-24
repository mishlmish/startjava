class JaegerTest {

    public static void main(String[] args) {
        Jaeger ja1 = new Jaeger();

        ja1.setModelName("Coyote Tango");
        ja1.setMark("Mark-1");
        ja1.setOrigin("Japan");
        ja1.setHeight(85.34f);
        ja1.setWeight(2.312f);
        ja1.setSpeed(5);
        ja1.setStrength(7);
        ja1.setArmor(4);

        Jaeger ja2 = new Jaeger();

        ja2.setModelName("Crimson Typhoon");
        ja2.setMark("Mark-4");
        ja2.setOrigin("China");
        ja2.setHeight(76.2f);
        ja2.setWeight(1.722f);
        ja2.setSpeed(9);
        ja2.setStrength(8);
        ja2.setArmor(6);

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