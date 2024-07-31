public class q1 {
        public static void countEvenOdd(int[] array) {
            int evenCount = 0;
            int oddCount = 0;
            
            for (int num : array) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            System.out.println("Even count: " + evenCount);
            System.out.println("Odd count: " + oddCount);
        }

    
}
