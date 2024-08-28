//write a java program to print the 2d array column wise without using print 

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int row = sn.nextInt();
        int col = sn.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sn.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for(int i = 0; i< arr.length; i++){
            for(int j = i; j<arr[i].length; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
