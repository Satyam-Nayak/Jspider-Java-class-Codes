//write a java program to find the missing number from the given array
public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,6,};
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        System.out.println("Missing number is " + (sum - sum1));
    }
}

    