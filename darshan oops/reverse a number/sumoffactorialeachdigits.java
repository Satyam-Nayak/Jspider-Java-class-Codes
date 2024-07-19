//write a program to print sum of factorial each digits
public class sumoffactorialeachdigits {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
    }
    return fact;
}
public static void main(String[] args) {
    int n = 145, n1= n;
    int sum = 0;
    int rem = 0;
    while (n != 0) {
        rem = n % 10;
        sum = sum + factorial(rem);
        n = n/10;
        }
        System.out.println(sum);
        System.out.println(sum==n1? "strong number":"not a strong number");
    }
}


// how he calls n1 in this code doubt
// darshan sir method


    

