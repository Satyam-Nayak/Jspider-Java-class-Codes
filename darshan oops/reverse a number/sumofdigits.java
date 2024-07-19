//write a java program to print the sum of the digits
public class sumofdigits {
    public static void main(String[] args) {
        int num = 7842;
        int sum = 0;
        while (num !=0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem;
            System.out.println(sum);
            }
            System.out.println("Sum digits is: " + sum);
            
    }
}


//darshan sir