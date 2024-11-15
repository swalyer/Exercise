import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Scanner in = new Scanner(System.in);
        Student student = new Student("John", "Doe", 20, new HashSet<>());
        boolean exit = false;
        while(!exit){
            System.out.println("1. Add subject");
            System.out.println("2. Delete subject" );
            System.out.println("3. Show subjects");
            System.out.println("4. Exit");
            option = in.nextInt();
            in.nextLine();
        switch (option){
            case 1: {
                System.out.println(student.getCourses());
                System.out.println("Enter the subject name");
                String course = in.nextLine();
                student.addCourse(course);
                System.out.println("Added successfully");
                break;
            }
            case 2: {
                System.out.println(student.getCourses());
                System.out.println("Delete subject");
                student.removeCourse(in.nextLine());
                System.out.println("Deleted successfully");
                break;
            }
            case 3:{
                System.out.println("3. Show subjects");
                System.out.println(student.getCourses());
                break;
            }
            case 4:{
                exit = true;
                break;
            }



        }}


    }
}