//write a code in java to print the sum of first half + second half from the given number.
// calculate the sum of the first half and the second half of the number as whole numbers, you can modify the code to:

// Split the number into two parts.
// Convert each part to an integer.
// Add the two integers together.
// Print the result.
import java.util.Scanner;
public class demo {

    static int count(int n){
        int c = 0;
        while(n!=0){
            c++;
            n = n/10;
        }
        return c;
    }

    static int power(int base, int ex){
        int pow = 1;
        for(int i=0; i<ex; i++){
            pow = pow*base;
        }
        return pow;
    }
    public static void main(String[] args) {
        int n = 1230;
        int ans = power(10,count(n)/2);
        System.out.println(ans);
        System.out.println("First half" + (n/ans));
        System.out.println("second half"+ (n%ans));
        System.out.println("sum:" + ((n/ans)+(n%ans)));
    }
    
}
