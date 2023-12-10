package University;


import java.util.ArrayList;
import java.util.HashMap;


public class Umanage {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Pritam");
        Student s2 = new Student(102, "Bibek");

        Teacher t1 = new Teacher(501, "Prof.Dhruv");
        Teacher t2 = new Teacher(502, "Prof.Sachin");

        Course c1 = new Course(1001, "English");
        Course c2 = new Course(1002, "Science");


        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        t1.assignCourse(c1);

        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        t2.assignCourse(c2);

        s1.display();
        s2.display();

        t1.display();
        t2.display();

        s1.removeCourse(c1);
        t1.unassignCourse(c1);

        s1.display();
        t1.display();

        Exam e1 = new Exam(c1);
        HashMap<Student, Integer> sheet = new HashMap<Student, Integer>();

        sheet.put(s1,80);
        sheet.put(s2,95);

        e1.addMarks(sheet);
        e1.displayMarks();

    }


}

