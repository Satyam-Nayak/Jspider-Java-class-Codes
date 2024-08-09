//write a java program to find the max and min in array using advance for loop

public class q1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int max = arr[0];
        int min = arr[0];
        for(int ele:arr){
            if(ele>max){
                max=ele;
            }
            if(ele<min){
                min=ele;
            }

        }
        System.out.println("Maximum ele:- "+ max);
        System.out.println("Minimum ele:- "+ min);

    }
    
}
