public class demo1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int val = 5;
        for (int i=0;i<arr.length;i++){
            arr[i] = val;
            val+=5;
        }
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
