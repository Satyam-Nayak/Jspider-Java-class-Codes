public class atm {
    public static void main(String[] args) {
        int balance = 75000;
        int amount = 150000;
        
        boolean pancard = true;
        if ( amount >= 100000 || pancard == true) {
            System.out.println("pancard is to need link ");
        } 
        if (amount < 100000) {
            System.out.println("pancard is optional");
            int totalam = balance + amount;
        System.out.println( "total balance now " + totalam);
    }
}
}
