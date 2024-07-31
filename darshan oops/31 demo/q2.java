//2. Sum of even element and odd element in array(seperatly)

public class q2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        sumEvenOdd(numbers); 
    }
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

        System.out.println("Sum of evens: " + evenSum);
        System.out.println("Sum of odds: " + oddSum);
    }

    
}
