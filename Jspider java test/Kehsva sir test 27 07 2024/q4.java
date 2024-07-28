import java.util.Scanner;

class Product {
    private static int idCounter = 1;
    
    private final int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.productId = idCounter++; 
         this.name = name;
         this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        System.out.println("===========Product Details=========");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
         System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========Enter Product Details=========");

        System.out.print("Product name: ");
        String name = scanner.nextLine();

        System.out.print("Product price: ");
        double price = scanner.nextDouble(); 

        System.out.print("Product quantity: ");
        int quantity = scanner.nextInt(); 
          scanner.nextLine();
        

           Product product = new Product(name, price, quantity);

        product.displayProductDetails();

        scanner.close();
    }
}
