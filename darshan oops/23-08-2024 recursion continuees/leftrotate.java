public class leftrotate {
        static void rotate(int[] arr){
            int ele = arr[0];
            for(int i = 0; i< arr.length-1; i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=ele;
        }
        public static void main(String[] args) {
            int[] arr = {5,6,7,8,9};
            int k = 1;
            for(int i = 1;i<=k;i++){
                rotate(arr);
            }
            for(int ele:arr){
                System.out.print(ele+" ");
            }
        }
    
}
