public class sortq2 {
    public static void main(String[] args) {
        // int[] arr = {5,2,3,4,1};
        int[] arr = {5,4,3,2,1};
        int c = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.println(arr[i]+ ""+arr[j]);
                c++;
            }
        }
        System.out.println("total numbet:- "+ c);
    }
}
