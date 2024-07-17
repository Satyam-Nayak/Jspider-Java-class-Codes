public class complic {
    public static void main(String[] args) {
        int p1 = 499  , p2 = 399  ,p3 = 1299 , p4 = 299 ;
        
        int cP = p1 + p2 + p3 + p4;
        int fP = cP;

        int d1 = 20; 
        int d2 = 10; 

        if (cP >= 2000) {
            int dA1 = (cP * d1) / 100;
            fP = cP - dA1;
        }

        if (cP < 2000) {
            int dA2 = (cP * d2) / 100;
            fP = cP - dA2;
        }

        System.out.println("The tp of items is = " + cP);
        System.out.println("The price after discount is = " + fP);
    }
    
}
