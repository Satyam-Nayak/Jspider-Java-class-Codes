import java.util.Scanner;
public class q4rotate90 {
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

        int[][] rot = new int[col][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rot[j][row - 1 - i] = arr[i][j];
            }
        }

        System.out.println("The 2D array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(rot[i][j] + " ");
            }
            System.out.println();
        }
    //     System.out.println("The 2D array after 90-degree rotation to the right is:");
    //     for (int j = 0; j < col; j++) {
    //         for (int i = row - 1; i >= 0; i--) {
    //             System.out.print(arr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }



    }
    
}
