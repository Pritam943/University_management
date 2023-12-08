package University;

import java.util.ArrayList;

class Teacher extends Person {

    private ArrayList<Course> assignedCourses;

    public Teacher(int id, String name){
        super(id, name);
        assignedCourses = new ArrayList<>();
    }

    public void assignCourse(Course course){
        assignedCourses.add(course);
        System.out.println(getName() + "has been assigned to course " + course.getCourseName() + ".");
        System.out.println();
    }
    public void unassignCourse(Course course){

        if(assignedCourses.contains(course)){
            assignedCourses.remove(course);
            System.out.println(getName()+ " is no longer assigned to course " + course.getCourseName() + ".");
            System.out.println();
        }
        else{
            System.out.println(getName()+ " is not assigned to course " + course.getCourseName() + ".");
            System.out.println();
        }
    }

    public void display(){
        System.out.println("Teacher ID : " + getId());
        System.out.println("Teacher name : " + getName());
        System.out.println("Courses Assigned :");
        for(Course course : assignedCourses){
            System.out.println(" * " + course.getCourseName());
        }
        System.out.println();
    }
}
