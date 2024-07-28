import java.util.Scanner;

class Customer {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;

    public Customer(String name, int age, String email, String phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayCustomerDetails() {
        System.out.println("=======databse=======");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Customer details===========");

         System.out.print("Customer name: ");
        String name = scanner.nextLine();

        System.out.print("Customer age: ");
        int age = scanner.nextInt(); 

        scanner.nextLine();

        System.out.print("Customer email: ");
        String email = scanner.nextLine();

        System.out.print("Customer phoneNo.: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Customer address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, age, email, phoneNumber, address);

        customer.displayCustomerDetails();

        scanner.close();
    }
}
