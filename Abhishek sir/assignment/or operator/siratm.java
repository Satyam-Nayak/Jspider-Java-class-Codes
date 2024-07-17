public class siratm {
    public static void main(String[] args) {
        int b = 75000; int amount = 115000;
        boolean pc = true;
        System.out.println(" balance= " + b);
        System.out.println( " am bala " + amount);
        if (amount < 100000 || pc == true){
            b = b + amount;

        }
        else {
            System.out.println(" link pan card");

        }
        System.out.println(" balance after deposite = " + b);
    }
}
