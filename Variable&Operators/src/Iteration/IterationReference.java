package Iteration;

import java.util.ArrayList;

public class IterationReference {
    public static void main(String[] args) {
        //tons of reference!!! careful!!!
        Student bryan = new Student();
        bryan.setName("bryan");
        ArrayList<Student> students = new ArrayList<>();
        students.add(bryan);
        ArrayList<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            students1.add(student);
        }
        Student student = students.get(0);
        student.setName("roger");
        System.out.println(students.get(0).getName());
    }
}
