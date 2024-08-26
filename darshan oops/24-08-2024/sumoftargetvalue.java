//write a java program to print the sum of two numbers is 10 from the given array
//input : [12,3,2,4,9,7,6,6,1,21,8]
//output : target =10
//

public class sumoftargetvalue {
    public static void main(String[] args) {
        int[] arr = {12, 3, 2, 4, 9, 7, 6, 6, 1, 21, 8};
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "," + arr[j]);
                    
                }
            }
        }
    }
}
