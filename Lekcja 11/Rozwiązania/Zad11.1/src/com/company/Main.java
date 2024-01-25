package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
     /* Create class Student with fields id, name, surname, grades, absences
	    Create class SchoolDiary with table of students and class name
	        - add method to save all students to files
	        - add method to load diary from files
	        - add method to pick student with the biggest average of grades
	        - add method to pick student with the biggest count of absences and smallest count of grades
	 */

        Student first = new Student(
                1,
                "Jan",
                "Nowak",
                new Number[]{1, 2, 3, 4, 5},
                new Date[]{new Date(), new Date(21312)});
        Student second = new Student(
                2,
                "Maciek",
                "Kowalski",
                new Number[]{5, 4, 5, 2, 5},
                new Date[]{});

        SchoolDiary classA = new SchoolDiary("classA");
        SchoolDiary classB = new SchoolDiary("classB", new Student[]{first, second});

        try {
            classA.load();
            classB.save();
        } catch (FileNotFoundException e) {
            System.out.println("Class or student dont exist");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Corrupted data in file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Can not save class");
            e.printStackTrace();
        }

        System.out.println(
                "In " + classA.getName() + " the best of student is " + classA.biggestGradesAverage().getFullName());
        System.out.println("In " + classA.getName() + " should be test " + classA.shouldBeTest().getFullName());

        System.out.println(
                "In " + classB.getName() + " the best of student is " + classB.biggestGradesAverage().getFullName());
        System.out.println("In " + classB.getName() + " should be test " + classB.shouldBeTest().getFullName());


    }
}
