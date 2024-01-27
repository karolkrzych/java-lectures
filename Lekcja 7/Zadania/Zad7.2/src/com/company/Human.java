package com.company;

public class Human {
    /*
     * Create outside class Human with fields name, surname, age, high, wight
     * Create inside public enums Job, Hobby and create fields for it in class Human
     * Create outside enum AnimalType and add special field in human
     * Add one methode to print on console all info about human
     * Add constructor to initialize example human
     * Use new class in Main class and use method for human to print all information
     */

    private String name, surname;
    private int age, height, weight;
    private Job job;
    private Hobby hobby;
    private AnimalType animalType;

    public Human(String name, String surname, int age, int height, int weight, Job job, Hobby hobby,
            AnimalType animalType) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.job = job;
        this.hobby = hobby;
        this.animalType = animalType;
    }

    public Human(String name, String surname, int age, int height, int weight,
            Job job, Hobby hobby) {
        this(name, surname, age, height, weight, job, hobby, AnimalType.MAMMAL);
    }

    public enum Job {
        PROGRAMMER, JANITOR, DRIVER, POLICEMAN
    }

    public enum Hobby {
        MUSIC, TRAVEL, GAMING, READING
    }

    public void humanInfo() {
        System.out.println(this.name + " " + this.surname + ", age: " + this.age + ", height: " + this.height
                + ", weight: " + this.weight + ", job: " + this.job + ", hobby: " + this.hobby + ", animalType: "
                + this.animalType);
    }
}
