package lab1.task2;

import java.util.Random;

public class Intrernship {
    private String name;
    String getName() {
        return name;
    }
    void setName(String s) {
        name = s;
    }

    private double minGrade;
    double getMinGrade() {
        return minGrade;
    }
    void setMinGrade(double no) {
        minGrade = no;
    }

    Student[] students = new Student[4];

    Student chooseCandidateRandomly() {
        Random rand = new Random();
        return students[rand.nextInt(students.length)];
    }

    void chooseCandidatesForInterview() {
        for (int i = 0; i < students.length; i++)
            if (students[i].getGrade() >= minGrade)
                System.out.println("Candidate " + students[i].getName() + " got a phone interview at " + name);
    }
}
