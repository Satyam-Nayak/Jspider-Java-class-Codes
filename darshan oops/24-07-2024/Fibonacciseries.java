//write a java program to print nth Fibonacci series using while loop
public class Fibonacciseries {
    public static void main(String[] args) {
        int i = 1;
        int n = 17;
        int first=0;
        int second=1;
        int next = 0;
        System.out.println("Fibonacci Series till " + n + " terms:");
        while (i <= n) {
            System.out.print(first + ", ");
            next = first+second;
            first=second;
            second=next;
            i++;
        }

    }

}

