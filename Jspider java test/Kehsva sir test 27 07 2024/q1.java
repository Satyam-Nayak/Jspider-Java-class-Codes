import java.util.Scanner;

class Car {
    private String brandName;
    private String engineType;
    private String fuelType;
    private int seatingCapacity;
    private String model;

    
    public Car(String brandName, String engineType, String fuelType, int seatingCapacity, String model) {
        this.brandName = brandName;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
        this.model = model;
    }

    public void displayCarDetails() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Model: " + model);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Enter Car Details================");

        System.out.print("Enter brand name: ");
        String brandName = scanner.nextLine();

        System.out.print("Enter engine type: ");
        String engineType = scanner.nextLine();

        System.out.print("Enter fuel type: ");
        String fuelType = scanner.nextLine();

        System.out.print("Enter seating capacity: ");
        int seatingCapacity = scanner.nextInt(); 

        scanner.nextLine();

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        Car car = new Car(brandName, engineType, fuelType, seatingCapacity, model);

        System.out.println("===============details=============");

        car.displayCarDetails();

        scanner.close();
    }
}
