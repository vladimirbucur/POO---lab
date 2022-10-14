package lab1.task2;

import javax.swing.colorchooser.ColorChooserComponentFactory;

public class JobMarket {
    public static void main(String[] args) {
        Student[] studentsArray = new Student[4];

//        Student studentGigel = new Student();
//        Student studentDorel = new Student();
//        Student studentMarcel = new Student();
//        Student studentIonel = new Student();

        studentsArray[0] = new Student();
        studentsArray[1] = new Student();
        studentsArray[2] = new Student();
        studentsArray[3] = new Student();

        studentsArray[0].setName("Gigel");
        studentsArray[1].setName("Dorel");
        studentsArray[2].setName("Marcel");
        studentsArray[3].setName("Ionel");

        studentsArray[0].setGrade(10);
        studentsArray[1].setGrade(9);
        studentsArray[2].setGrade(8);
        studentsArray[3].setGrade(7);

        Intrernship internshipGoogle = new Intrernship();
        Intrernship internshipAmazon = new Intrernship();
        Intrernship internshipFacebook = new Intrernship();
        Intrernship internshipMicrosoft = new Intrernship();

        internshipGoogle.setName("Google");
        internshipAmazon.setName("Amazon");
        internshipFacebook.setName("Facebook");
        internshipMicrosoft.setName("Microsoft");

        internshipGoogle.setMinGrade(7);
        internshipGoogle.students = studentsArray;

        internshipAmazon.setMinGrade(8);
        internshipAmazon.students = studentsArray;

        internshipFacebook.setMinGrade(9);
        internshipFacebook.students = studentsArray;

        internshipMicrosoft.setMinGrade(10);
        internshipMicrosoft.students = studentsArray;

        internshipGoogle.chooseCandidatesForInterview();
        System.out.println("\n");

        internshipAmazon.chooseCandidatesForInterview();
        System.out.println("\n");

        internshipFacebook.chooseCandidatesForInterview();
        System.out.println("\n");

        internshipMicrosoft.chooseCandidatesForInterview();
        System.out.println("\n");

        Student ana = new Student();
        Student ion  = new Student();

        ana.setName("Ana");
        ana.setGrade(10);

        ion.setName("Ion");
        ion.setGrade(9);

        if (ana.equals(ion))
            System.out.println("EGALE!");
    }
}
