//write a java program to print the nth prime number
public class nthprime {
    public static void main(String[] args) {
        int n = 8;
        int count = 0;
        int i = 2;

        while (count < n) {

            if (isPrime(i)) {
                count++;
            }
            i++;
        }
        System.out.println( n + "th prime number is " + (i - 1));
            }
            public static boolean isPrime(int n) {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
                    }
        }


