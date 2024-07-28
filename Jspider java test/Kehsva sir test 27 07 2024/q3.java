import java.util.Scanner;

class Registration {
    String name;
    String coursename;
    String email;
    Long phonenub;
    String degree;

    public Registration(String name, String coursename, Long phonenub, String degree) {
        this.name = name;
        this.coursename = coursename;
        this.phonenub = phonenub;
        this.degree = degree;
    }
    public Registration(String name, String coursename, String email, String degree) {
        this.name = name;
        this.coursename = coursename;
        this.email = email;
        this.degree = degree;
    }

    public Registration(String name, String coursename, String email, Long phonenub, String degree) {
        this.name = name;
        this.coursename = coursename;
        this.email = email;
        this.phonenub = phonenub;
        this.degree = degree;
    }

    void studentRegistration() {
        System.out.println("==================Student Registration===============");
        System.out.println("Name: " + name);
        System.out.println("Course Name: " + coursename);
        if (email != null) {
            System.out.println("Email: " + email);
        }
        if (phonenub != null) {
            System.out.println("Phone Number: " + phonenub);
        }
        System.out.println("Degree: " + degree);
    }

}

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============Choose one option to Register===================");

        System.out.println("Enter 1 to register using phone");
        System.out.println("Enter 2 to register using email");
        System.out.println("Enter 3 to register using phone and email");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Course Name:");
        String coursename = scanner.nextLine();
        System.out.println("Enter Degree:");
        String degree = scanner.nextLine();

        Registration registration = null;

        switch (choice) {
            case 1:
                System.out.println("Enter Phone Number:");
                long phone = scanner.nextLong();
                registration = new Registration(name, coursename, phone, degree);
                break;

            case 2:
                System.out.println("Enter Email:");
                String email = scanner.nextLine();
                registration = new Registration(name, coursename, email, degree);
                break;

            case 3:
                System.out.println("Enter Phone Number:");
                long phoneNum = scanner.nextLong();
                scanner.nextLine(); 
                System.out.println("Enter Email:");
                String emailId = scanner.nextLine();
                registration = new Registration(name, coursename, emailId, phoneNum, degree);
                break;

            default:
                System.out.println("Invalid choice. start the program again with valid option.");
                System.exit(0);
        }


        registration.studentRegistration();
        scanner.close();
    }
}