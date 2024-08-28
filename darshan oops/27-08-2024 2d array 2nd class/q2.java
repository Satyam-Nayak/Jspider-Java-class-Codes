//write a java program to print the 2d array colum wise

//====== Darshan sir====
import java.util.Scanner;
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // if we just change the arr[i][j] to arr[j][i] it will print colomn wise
                System.out.print(arr[j][i] + " "); 
            }
            System.out.println();
        }

    }
}

// ++++++ My approch ++++++++++
// import java.util.Scanner;

// public class q2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int[][] arr = new int[row][col];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("The 2D array printed column-wise is:");
//         for (int j = 0; j < arr.length; j++) {
//             for (int i = 0; i < arr[j].length; i++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

