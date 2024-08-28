import java.util.Scanner;

public class q4darshansir {

    static void reverse(int[] arr){
        int l = 0; 
        int h = arr.length - 1;
        while (l < h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int row = sn.nextInt();
        int col = sn.nextInt();
        int[][] arr = new int[row][col];

        // Filling the array with values
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sn.nextInt();
            }
        }

        // Transpose the matrix
        for(int i = 0; i < row; i++){
            for(int j = i + 1; j < col; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for(int i = 0; i < row; i++){
            reverse(arr[i]);
        }

        // Print the result
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sn.close();
    }
}


// import java.util.Scanner;

// public class q4darshansir {
//     static void reverse(int[] arr){
//         int l = 0; 
//         int h=arr.length-1;
//         while (l<h) {
//             int temp = arr[l];
//             arr[l] = arr[h];
//             arr[h] = temp;
//             l++;
//             h--;
            
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sn = new Scanner(System.in);
//         int row = sn.nextInt();
//         int col = sn.nextInt();
//         int[][] arr = new int[row][col];
//         for(int i = 0; i<arr.length;i++){
//             for(int j = 0; j<arr[i].length;j++){
//                 int temp = arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//         }
//         for(int i = 0; i<arr.length;i++){
//             reverse(arr[i]);
//         }
//         for(int i = 0; i<arr.length;i++){
//             for(int j = 0; j<arr.length;j++){
//                 System.out.print(arr[i][j]+" ");
//         }
//         System.out.println();
//     }
// }
// }