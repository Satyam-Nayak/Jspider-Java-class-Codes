public class rightrotate{
    static void rotate(int[] arr){
        int ele = arr[arr.length-1];
        for(int i = arr.length-1; i>=1; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=ele;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        int k = 2;
        for(int i = 1;i<=k;i++){
            rotate(arr);
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}