public class q3 {
        public static void sumPrimeElements(int[] array) {
            int primeSum = 0;
            
            for (int num : array) {
                if (isPrime(num)) {
                    primeSum += num;
                }
            }
            
            System.out.println("Sum of prime elements: " + primeSum);
        }
    
        private static boolean isPrime(int num) {
            if (num <= 1) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;
            
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) return false;
            }
            return true;
        }
    
    
}
