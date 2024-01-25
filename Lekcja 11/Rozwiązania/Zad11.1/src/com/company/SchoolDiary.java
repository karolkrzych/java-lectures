package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

public class SchoolDiary {

    private String name;
    private Student[] students;

    public SchoolDiary(String name) {
        this.name = name;
    }

    public SchoolDiary(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public void load() throws FileNotFoundException, ParseException {
        File classFolder = new File(name);
        if (classFolder.exists() && classFolder.isDirectory()) {
            students = new Student[classFolder.listFiles().length];

            for (int i = 0; i < students.length; i++) {
                students[i] = Student.load(classFolder.listFiles()[i]);
            }
        }
    }

    public void save() throws IOException {
        File classFolder = new File(this.name);

        if (!classFolder.exists()) {
            Files.createDirectory(Paths.get(this.name)).toFile();
        }

        if (classFolder.isDirectory()) {
            for (Student student : this.students) {
                student.save(classFolder);
            }
        }
    }

    public Student biggestGradesAverage() {
        if (this.students.length > 0) {
            Student max = this.students[0];
            for (Student student : this.students) {
                max = student.gradesAverage() > max.gradesAverage() ? student : max;
            }
            return max;
        } else {
            return null;
        }
    }

    public Student shouldBeTest() {
        if (this.students.length > 0) {
            Student max = this.students[0];
            for (Student student : this.students) {
                max = student.getAbsences().length > max.getAbsences().length ? student : max;
                if (max.getAbsences().length == student.getAbsences().length) {
                    max = student.getGrades().length < max.getGrades().length ? student : max;
                }
            }
            return max;
        } else {
            return null;
        }

    }

    public String getName() {
        return name;
    }


}
