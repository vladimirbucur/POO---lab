package task2;

public class Student implements Comparable<Student> {
    private final Float grade;

    public Student(final Float grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(final Student student) {
        return this.grade.compareTo(student.grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}
