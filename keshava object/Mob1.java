class Mobile {
    // attributes
    String brand;
    String os;
    double price;
    String currency;
    
    // if attributes are not initialized what will be there
    // behaviour
    void showDetails() {
        System.out.println("Mobile Details:");
        System.out.println("Brand: " + brand);
        System.out.println("OS: " + os);
        System.out.println("Price: " + price + " " + currency);
    }

    void currencyRecharge(double amount) {
        price += amount;
        System.out.println("Recharged with amount: " + amount + " " + currency);
        System.out.println("New price: " + price + " " + currency);
    }

    void changeOS(String newOS) {
        os = newOS; 
        // parameter is assigned to attribute
    }

    void changeCurrency(String newCurrency) {
        currency = newCurrency; 
        // parameter is assigned to attribute
    }
}

public class Mob1 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.os = "Android";
        m1.price = 79999.99;
        m1.currency = "Rupees";
        m1.showDetails();
        
        m1.changeOS("Android 12");
        m1.showDetails();
        
        m1.currencyRecharge(50.0);
        
        m1.changeCurrency("rupees");
        m1.currencyRecharge(50.0);
        
        System.out.println("main method ended");
    }
}
