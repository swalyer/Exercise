import java.util.HashSet;


public class Student {
    private String firstName;
    private String secondName;
    private int age;
    private HashSet<String> courses;


    public Student(String firstName, String secondName, int age, HashSet<String>courses){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.courses = courses;
    }
    public String addCourse(String course){
        return this.courses.add(course) ? "Added successfully" : "Course already exists";
    }

    public HashSet<String> getCourses() {
        return courses;
    }
    public void setCourses(java.util.HashSet<String> courses) {
        this.courses = courses;
    }

    public void removeCourse(String course) {
        this.courses.remove(course);
    }
}
