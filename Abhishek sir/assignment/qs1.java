public class qs1 {
    public static void main(String[] args) {
        int prod1 = 499;
        int prod2 = 399;
        int prod3 = 1299;
        int prod4 = 299;

        int totalprice = prod1+ prod2 + prod3 + prod4;
        double dp = totalprice;
        if (totalprice >= 2000) {
            dp = totalprice - (totalprice * 0.2 );
        }
        if (totalprice < 2000) {
            dp = totalprice - (totalprice * 0.1 );
        }
        System.out.println("total peice of the products is = " + totalprice);
        System.out.println("discount price is = " + dp);
    }
}
