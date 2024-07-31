//Count the number even and odd element in array

public class q1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        countEvenOdd(numbers); 
    }
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
