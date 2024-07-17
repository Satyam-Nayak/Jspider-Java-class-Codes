public class q2 {
    public static void main(String[] args) {
        int prod1 = 499;
        int prod2 = 399;
        int prod3 = 1299;
        int prod4 = 299;

        int totalPrice = prod1 + prod2 + prod3 + prod4;

        double discountedPrice = totalPrice;

        if (totalPrice >= 2000) {
            discountedPrice = totalPrice * 0.80; 
        }
        if (totalPrice < 2000) {
            discountedPrice = totalPrice * 0.90; 
        }

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
