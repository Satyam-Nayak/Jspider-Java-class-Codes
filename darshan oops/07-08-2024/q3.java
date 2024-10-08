//write a java program to check the given array is palindrome or not

public class q3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        boolean flag = true;
        int l=0,h=arr.length-1;
        
        while(l<h){
            if(arr[l]==arr[h]){
                l++; h--;
               
            } else{
                flag = false;
                break;
            }  
        }
        System.out.println(flag==true?"Palindrome":"Not palindrome");
    }
}