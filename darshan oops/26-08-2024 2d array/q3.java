//sum of digonal element of the 2D array
public class q3 {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
             {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum = sOD(arr);
        System.out.println("Sum of diagonal elements: " + sum);
    }

    public static int sOD(int[][] arr) {
        int sum = 0;
        int i = 0;
        for (int[] row : arr) {
            sum += row[i]; // Primary diagonal element
            if (i != arr.length - i - 1) {
                sum += row[arr.length - i - 1]; // Secondary diagonal element
            }
            i++;
        }
        return sum;
    }
}
