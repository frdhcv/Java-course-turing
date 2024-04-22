package az.edu.turing.MyProjects;

public class Student {

    public int age;

    public String name;
    public double grade;

    public long id;

    public Student() {
    }

    public Student(int age, String name, double grade, long id) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "{age=%d, name='%s', grade=%s, id=%d}".formatted(age, name, grade, id);
    }
}
