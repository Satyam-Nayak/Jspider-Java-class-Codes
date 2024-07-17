public class assigncar {
    public static void main(String[] args) {
        String carname = "verna";
        double price = 1345000;
        int cc = 1500;
        double tax = 0;
        double insurance = 0;
         if (price < 1000000){
            tax = price * 0.28;
         } else if (price >= 1000000 && price < 2000000) {
            tax = price * 0.31;
         } else if (price >= 2000000 && price < 3000000) {
            tax = price * 0.34;
         }else {
            tax = price * 0.38;
         }

         if (cc < 1000) {
            insurance = 3540;
         } else if (cc >= 1000 && cc < 2000) {
            insurance = 5950;
         } else if (cc >= 2000 && cc < 3000) {
            insurance = 6500;
         } else {
            insurance = 7890;
         }

         insurance = insurance * 5;
         double totalprice = price+tax+insurance;

         System.out.println("car name: " + carname);
         System.out.println("price: " + price);
         System.out.println("tax: " + tax);
         System.out.println("insurance for 5 years: " + insurance);
         System.out.println("total price of the car : " + totalprice);

    }
}
