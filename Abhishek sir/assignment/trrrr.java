public class trrrr {
    public static void main(String[] args) {
        int flavour_code = 1;
        double price = 0;
        String flavour = null;
        boolean topings = true;
        boolean dryfruits = true;

        double vanillaPrice = 100;
        double kiwiPrice = 115;
        double dragonPrice = 135;

        double topingsPrice = 15;
        double dryfruitsPrice = 30;
        double gstRate = 0.18;

        if (flavour_code == 1) {
            flavour = "vanilla";
            price = vanillaPrice;
        }
        if (flavour_code == 2) {
            flavour = "kiwi";
            price = kiwiPrice;
        }
        if (flavour_code == 3) {
            flavour = "dragon";
            price = dragonPrice;
        }

        if (topings) {
            price += topingsPrice;
        }
        if (dryfruits) {
            price += dryfruitsPrice;
        }

        double gstAmount = price * gstRate;
        price += gstAmount;

        System.out.println("Flavour: " + flavour);
        System.out.println("Base Price: " + price);
        System.out.println("GST Amount: " + gstAmount);
        System.out.println("Final Price: " + price);
    }
}
