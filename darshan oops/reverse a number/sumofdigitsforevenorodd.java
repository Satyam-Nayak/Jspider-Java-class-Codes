public class sumofdigitsforevenorodd {
    public static void main(String[] args) {
        int n = 12346;
        int rem = 0, esum= 0, osum=0;
        while (n!=0) {
            rem = n % 10;
            if (rem % 2 == 0) {
                esum = esum + rem;
                } else {
                    osum = osum + rem;
                    }
                    n = n / 10;
                    }
                    System.out.println("Sum of even digits is " + esum);
                    System.out.println("Sum of odd digits is " + osum);
            
        }
    }
//in one code two operation held by darshen sir