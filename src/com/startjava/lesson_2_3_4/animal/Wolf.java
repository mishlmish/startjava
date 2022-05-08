package com.startjava.lesson_2_3_4.animal;

class Wolf {
    
    private String sex;
    private String name;
    private float weight;
    private int age;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String walk() {
        return "идет";
    }

    public String sit() {
        return "сидит";
    }

    public String run() {
        return "бежит";
    }

    public String howl() {
        return "воет";
    }

    public String hunt() {
        return "охотится";
    }
}