

class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();

    wolf1.sex = "самец";
    wolf1.name = "Акела";
    wolf1.weight = 11;
    wolf1.age = 5;
    wolf1.color = "серый";


    System.out.println("Волка зовут :" + wolf1.name);
    System.out.println("Волк " + wolf1.sex);
    System.out.println("Волка весит " + wolf1.weight + " кг");
    System.out.println("Возраст волка :" + wolf1.age + " лет");
    System.out.print("Окрас волка " + wolf1.color);

    System.out.println("\nВолк " + wolf1.howl() + " , " + wolf1.run() + " , " +
            wolf1.sit() + " , " + wolf1.walk() + " , " + wolf1.hunt());

    }
}