//write a java program to find maximum element in an array

public class q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,66,5};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
            }
            System.out.println("Maximum element in it: "+max);
        }
    }
    

