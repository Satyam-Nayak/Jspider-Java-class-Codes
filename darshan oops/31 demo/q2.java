public class q2 {
        public static void sumEvenOdd(int[] array) {
            int evenSum = 0;
            int oddSum = 0;
            
            for (int num : array) {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }
            
            System.out.println("Sum of even elements: " + evenSum);
            System.out.println("Sum of odd elements: " + oddSum);
        }
    
    
}
