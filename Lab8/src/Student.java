import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private long id;
    private double averageGrade;

    public Student(final String name, final String surname, final long id, final double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(final Student student) {
        if (this.getAverageGrade() > student.getAverageGrade()) {
            return 1;
        } else if (this.getAverageGrade() < student.getAverageGrade()) {
            return -1;
        } else {
            if (this.getSurname().compareTo(student.getSurname()) > 0) {
                return 1;
            } else if (this.getSurname().compareTo(student.getSurname()) < 0) {
                return -1;
            } else {
                if (this.getName().compareTo(student.getName()) > 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(final double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", averageGrade=" + averageGrade +
                '}' + "\n";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.averageGrade, averageGrade) == 0 && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }
}
