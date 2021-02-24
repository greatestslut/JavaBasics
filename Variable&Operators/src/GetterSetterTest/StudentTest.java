package GetterSetterTest;

import GetterSetterTest.Student;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();

        ArrayList<String> testAttr = student.getTestAttr();
        testAttr.add("bug comes");
        System.out.println(student.getTestAttr());
    }
}
