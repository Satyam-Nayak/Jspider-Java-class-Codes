import java.util.Scanner;

public class q3darshan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("MAX no:"+ max);
    }
    
}

//output:
// 5
// 45 66 32 88 12
// MAX no:88
