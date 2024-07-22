//write a java program to find the given number is a armstrong number or not
//every single digits are amstrong number
public class armstrongnumber {
    static int power(int base, int exp){
        int pow = 1;
        for (int i = 1; i <= exp; i++) {
            pow = pow * base;
        }
        return pow;
    }
    static int count(int m){
        int c = 0;
        while (m!=0){
           c++;
           m=m/10; 
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 1,n1=n;
        int ex = count(n);
        int sum = 0;
        int rem = 0;
        while(n!=0){
            rem = n%10;
            sum = sum +power(rem,ex);
            n=n/10;
        }
        if(n1==sum){
            System.out.println("armstrong number");

        } else {
            System.out.println("not armstrong number");
        }
        
        }
    }

