package az.edu.turing.MyProjects;

import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>(new Student());
        Student Farid = new Student(20, "Farid", 98, 123456);
        Student Vusal = new Student(21, "VUsal", 98, 456789);
        students.addHead(Farid);
        students.addHead(Vusal);
        System.out.println(students);
        System.out.println(Farid.getId());
    }
}
