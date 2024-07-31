//write a java program to find the missing number from the given array using Scanner class
public class q1me {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        int n=arr.length+1;
        int sum= (n* (n+1))/2;
        int sum1 = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum1 = sum1 + arr[i];

        }
        System.out.println("missing number is "+ (sum - sum1));
        
            }

    }