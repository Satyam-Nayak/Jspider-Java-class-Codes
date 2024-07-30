//create an array for user input
import java.util.Scanner;

public class q2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("==========Array ele==========");
            for(int i = 0; i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
}


//Create a user input for this code