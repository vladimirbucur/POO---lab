package task2.database;

import task2.people.Student;
import task2.people.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    private static Database database = null;
    private static int instanceCount = 0;

    private Database() {
        instanceCount++;
    }

    public static Database getDatabase() {
        if (database == null)
            database = new Database();

        return database;
    }

    public static int getNumberOfInstances() {
        return instanceCount;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> teachersBySubject = new ArrayList<>();
        for (Teacher teacher : teachers) {

            if (teacher.getSubjects().contains(subject) == true)
                teachersBySubject.add(teacher);
        }
        return  teachersBySubject;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> studentsBySubject = new ArrayList<>();
        for (Student student : students) {
            if (student.getSubjects().containsKey(subject) == true)
                studentsBySubject.add(student);
        }
        return  studentsBySubject;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> studentsByAverageGrade = new ArrayList<>(students);
        studentsByAverageGrade.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if(student1.averageGrade() > student2.averageGrade())
                    return 1;
                else if (student1.averageGrade() < student2.averageGrade())
                    return -1;
                return 0;
            }
        });
        return studentsByAverageGrade;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> StudentsByGradeForSubject = new ArrayList<>();
        for (Student student : students) {
            if (student.getSubjects().containsKey(subject) == true)
                StudentsByGradeForSubject.add(student);
        }

        StudentsByGradeForSubject.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if(student1.getGradeForSubject(subject) > student2.getGradeForSubject(subject))
                    return 1;
                else if (student1.getGradeForSubject(subject) < student2.getGradeForSubject(subject))
                    return -1;
                return 0;
            }
        });

        return StudentsByGradeForSubject;
    }
}
