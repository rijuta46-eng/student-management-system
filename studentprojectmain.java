import java.util.ArrayList;
import java.util.Scanner;
 class StudentprojectMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {  
          
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    Student student =
                            new Student(id, name, age, email, course);

                    students.add(student);

                    System.out.println("Student added successfully!");

                    break;


                case 2:

                    if (students.isEmpty()) {

                        System.out.println("No students found.");

                    } else {

                        for (Student s : students) {

                            System.out.println("\n" + s);
                        }
                    }

                    break;


                case 3:

                    System.out.println("Thank you!");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}