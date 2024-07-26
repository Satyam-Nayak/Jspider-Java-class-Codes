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
        System.out.println("============Student Registration===============");
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

    void updatePhoneNumber(long phoneNumber) {
        System.out.println("Updating Phone Number: ");
        this.phonenub = phoneNumber;
    }

    void updateEmail(String email) {
        System.out.println("Updating Email: ");
        this.email = email;
    }
}

public class start3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                System.out.println("Invalid choice. Please restart the program and select a valid option.");
                System.exit(0);
        }

        registration.studentRegistration();

        System.out.println("Do you want to update phone number or email? (yes/no)");
        String updateChoice = scanner.nextLine();

        if (updateChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter 1 to update phone number");
            System.out.println("Enter 2 to update email");
            int updateType = scanner.nextInt();
            scanner.nextLine(); 

            switch (updateType) {
                case 1:
                    System.out.println("Enter New Phone Number:");
                    long newPhone = scanner.nextLong();
                    registration.updatePhoneNumber(newPhone);
                    break;

                case 2:
                    System.out.println("Enter New Email:");
                    String newEmail = scanner.nextLine();
                    registration.updateEmail(newEmail);
                    break;

                default:
                    System.out.println("Invalid choice. No updates made.");
            }
        }

        registration.studentRegistration();
        scanner.close();
    }
}
