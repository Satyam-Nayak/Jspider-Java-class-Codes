public class prog5 {
    public static void main(String[] args) {
        int friends = 6;
        double price = 115.00;
        double doshaprice = friends * price;
        double gst = (doshaprice * 18) / 100;
        double total = doshaprice + gst;
        System.out.println("Total Payable Amount is : " + total);
    }
}
