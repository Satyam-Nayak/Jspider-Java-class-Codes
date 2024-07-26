import java.util.Scanner;

class Registration {
    String name;
    String coursename;
    String email;
    Long phonenum;
    String degree;

    public Registration(String name, String coursename, Long phonenub, String degree) {
        this.name = name;
        this.coursename = coursename;
        this.phonenum = phonenum;
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
        this.phonenum = phonenum;
        this.degree = degree;
    }

    void studentRegistration() {
        System.out.println("============Student Registration===============");
        System.out.println("Name: " + name);
        System.out.println("Course Name: " + coursename);
        if (email != null) {
            System.out.println("Email: " + email);
        }
        if (phonenum != null) {
            System.out.println("Phone Number: " + phonenum);
        }
        System.out.println("Degree: " + degree);
    }
}

public class start2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to register using phone");
        System.out.println("Enter 2 to register using email");
        System.out.println("Enter 3 to register using phone and email");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Course Name:");
        String coursename = scanner.nextLine();
        System.out.println("Enter Degree:");
        String degree = scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter Phone Number:");
                long phone = scanner.nextLong();
                Registration r1 = new Registration(name, coursename, phone, degree);
                r1.studentRegistration();
                break;

            case 2:
                System.out.println("Enter Email:");
                String email = scanner.nextLine();
                Registration r2 = new Registration(name, coursename, email, degree);
                r2.studentRegistration();
                break;

            case 3:
                System.out.println("Enter Phone Number:");
                long phoneNum = scanner.nextLong();
                scanner.nextLine(); // Consume newline left-over
                System.out.println("Enter Email:");
                String emailId = scanner.nextLine();
                Registration r3 = new Registration(name, coursename, emailId, phoneNum, degree);
                r3.studentRegistration();
                break;

            default:
                System.out.println("Invalid choice. Please restart the program and select a valid option.");
        }

        scanner.close();
    }
}
