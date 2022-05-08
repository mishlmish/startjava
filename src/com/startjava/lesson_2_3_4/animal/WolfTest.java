package com.startjava.lesson_2_3_4.animal;

class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();

        wolf1.setSex("самец");
        wolf1.setName("Акела");
        wolf1.setWeight(5);
        wolf1.setAge(7);
        wolf1.setColor("черный");

        System.out.println("Волка зовут " + wolf1.getName());
        System.out.println("Волк " + wolf1.getSex());
        System.out.println("Волка весит " + wolf1.getWeight() + " кг");
        System.out.println("Возраст Волка " + wolf1.getAge() + " лет");
        System.out.print("Окрас Волка " + wolf1.getColor());

        System.out.println("\nВолк " + wolf1.howl() + " , " + wolf1.run() + " , " +
                wolf1.sit() + " , " + wolf1.walk() + " , " + wolf1.hunt());
    }
}