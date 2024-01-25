package com.company;

import java.util.Arrays;

public class Human {

    private char[] name, surname;
    private byte age;
    private float high, wight;
    private Job job;
    private Hobby hobby;
    private AnimalType animalType;

    public Human(char[] name, char[] surname, byte age, float high, float wight, Job job, Hobby hobby,
            AnimalType animalType) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.high = high;
        this.wight = wight;
        this.job = job;
        this.hobby = hobby;
        this.animalType = animalType;
    }

    public Human(char[] name, char[] surname, byte age, float high, float wight, Job job, Hobby hobby) {
        this(name, surname, age, high, wight, job, hobby, AnimalType.MAMMALS);
    }

    public enum Job {
        DEV, TESTER, ADMIN
    }

    public enum Hobby {
        GAMES, SING, DANCE
    }

    public void print() {
        System.out.println("Human{" +
                "name=" + Arrays.toString(name) +
                ", surname=" + Arrays.toString(surname) +
                ", age=" + age +
                ", high=" + high +
                ", wight=" + wight +
                ", job=" + job +
                ", hobby=" + hobby +
                ", animalType=" + animalType +
                '}');
    }
}
