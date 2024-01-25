package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    private Number no;
    private String name;
    private String surname;
    private Number[] grades;
    private Date[] absences;

    private final static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Student(Number no, String name, String surname, Number[] grades, Date[] absences) {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.grades = grades;
        this.absences = absences;
    }

    public static Student load(File file) throws FileNotFoundException, ParseException {
        Scanner load = new Scanner(file);

        Number no = Integer.parseInt(load.nextLine());
        String name = load.nextLine();
        String surname = load.nextLine();

        String gradesLine = load.nextLine();
        Number[] gradesNumber;
        if (!gradesLine.isEmpty()) {
            String[] grades = gradesLine.split(";");
            gradesNumber = new Number[grades.length];

            for (int i = 0; i < grades.length; i++) {
                gradesNumber[i] = Double.parseDouble(grades[i]);
            }
        } else {
            gradesNumber = new Number[0];
        }

        String absencesLine = load.nextLine();
        Date[] absencesDates;
        if (!absencesLine.isEmpty()) {
            String[] absences = absencesLine.split(";");
            absencesDates = new Date[absences.length];

            for (int i = 0; i < absences.length; i++) {
                absencesDates[i] = dateFormat.parse(absences[i]);
            }
        } else {
            absencesDates = new Date[0];
        }
        return new Student(no,name,surname,gradesNumber,absencesDates);

    }

    public void save(File directory) throws FileNotFoundException {
        File savedFile = new File(directory.getAbsolutePath() + File.separator + this.no + ".txt");
        PrintWriter save = new PrintWriter(savedFile);

        save.println(this.no);
        save.println(this.name);
        save.println(this.surname);

        if (grades.length > 0) {
            String gradesToSave = "";
            for (Number i : this.grades) {
                gradesToSave += i + ";";
            }
            save.println(gradesToSave);
        }

        if (absences.length > 0) {
            String absencesToSave = "";
            for (Date i : this.absences) {
                absencesToSave += dateFormat.format(i) + ";";
            }
            save.println(absencesToSave);
        }

        save.close();
    }

    public double gradesAverage() {
        double sum = 0;
        for (Number grade : grades) {
            sum += grade.doubleValue();
        }
        return sum / grades.length;
    }

    public Number[] getGrades() {
        return grades;
    }

    public Date[] getAbsences() {
        return absences;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}
