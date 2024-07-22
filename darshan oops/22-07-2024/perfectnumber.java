//write a prgram to print the given number is a perfect number or not in java

public class perfectnumber {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("perfect number");
        } else{
            System.out.println("not a perfect number");
            }
            }
        }

            
