//write a java program traverse a 2D matrix into matrix format.

public class q2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,7,9},{4,5},{7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
             {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//if we use arr.length it will thorow 
//1 2 3 
// 4 5 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
// at q2.main(q2.java:9)