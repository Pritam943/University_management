package University;

import java.util.HashMap;
import java.util.Map;

public class Exam {

    String EName;
    HashMap<Student, Integer> MarkSheet = new HashMap<Student, Integer>();

    public  Exam(Course course){
        EName = course.getCourseName();
        System.out.println("Exam conducted on subject : " + EName);
    }

    void addMarks(HashMap<Student, Integer> exam){

        for(Map.Entry<Student, Integer> Exam : exam.entrySet()){
            Student st = Exam.getKey();
            int mark = Exam.getValue();

            MarkSheet.put(st, mark);
        }
    }

    void displayMarks(){
//        System.out.println("Marks of Subject : " + EName);
//        System.out.println();
        for (Map.Entry<Student, Integer> marks : MarkSheet.entrySet()){
            Student st = marks.getKey();
            System.out.println();
            System.out.println("[ Student Name : " + st.getName() );
            System.out.println(" Marks obtained : " + marks.getValue() + " ]");
        }

    }

}
