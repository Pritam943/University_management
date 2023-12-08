package University;

import java.util.ArrayList;

class Student extends Person{

    private ArrayList<Course> enrolledCourses;

    public Student(int id, String name){
        super(id, name);
        enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course){
        enrolledCourses.add(course);
        System.out.println(getName() + " has enrolled in " + course.getCourseName() + ".");
        System.out.println();
    }
    public  void removeCourse(Course course){
        if(enrolledCourses.contains(course)){
            enrolledCourses.remove(course);
            System.out.println(getName() + " has deregister in " + course.getCourseName() + ".");
            System.out.println();
        }
        else{
            System.out.println(getName() + " is not enrolled in " + course.getCourseName() + ".");
            System.out.println();
        }
    }

    public void display(){
        System.out.println("Studet ID : " + getId());
        System.out.println("Student name : " + getName());
        System.out.println("Courses Enrolled:");
        for(Course course : enrolledCourses){
            System.out.println(" * " + course.getCourseName());
        }
        System.out.println();
    }
}
