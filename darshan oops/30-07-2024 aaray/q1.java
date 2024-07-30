//write a java program to get the sum of elements of an given array
public class q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements in given array is " + sum);
    }
    
}

// arr.length-1
