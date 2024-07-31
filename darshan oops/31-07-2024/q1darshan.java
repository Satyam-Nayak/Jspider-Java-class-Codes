//write a java program to find the missing number from the given array using Scanner class
public class q1darshan {
    public static void main(String[] args) {
        int[] arr={4,5,6,8,9,10};
        int sp=arr[0];
        int ep=arr[arr.length-1];
        int sum1=0; //sum from sp to ep
        for(int i=sp;i<=ep;i++) {
            sum1=sum1+i;
        }
        int sum2=0; //sum of all elements in the array
        for(int i=0;i<arr.length;i++) {
            sum2=sum2+arr[i];
        }
        System.out.println("missing element: " + (sum1-sum2));
            }

    }