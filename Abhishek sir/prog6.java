public class prog6 {
    public static void main(String[] args) {
        int prod1 = 299;
        int prod2 = 699;
        int prod3 = 1499;
        int prod4 = 1899;
        int totalprodprice = prod1 + prod2 + prod3 + prod4;
        System.out.println("Total price of all products is: " + totalprodprice);
        double discount = (totalprodprice * 25) / 100;
        double totalpricetopay = totalprodprice - discount;
        System.out.println("Total price of the products is: " + totalpricetopay);
    }
    
}












