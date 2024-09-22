import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();  // Number of queries
        
        for (int i = 0; i < queries; i++) {
            int a = sc.nextInt();  // The initial value
            int b = sc.nextInt();  // The multiplier
            int n = sc.nextInt();  // The number of terms
            
            int currentValue = a;
            for (int j = 0; j < n; j++) {
                currentValue += b * (1 << j);  // Calculate the value using powers of 2
                System.out.print(currentValue + " ");  // Print each term in the series
            }
            System.out.println();  // Move to the next line after each series
        }
        
        sc.close();
    }
}
