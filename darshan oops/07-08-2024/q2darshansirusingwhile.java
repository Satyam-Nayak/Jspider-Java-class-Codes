public class q2darshansirusingwhile {
    public static void main(String[] args) {
        int n = 12380;
        String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int rem = 0;
        String ans="";
        while(n!=0) {
            rem = n%10;
            ans=arr[rem]+ans;
            n=n/10;
        }
        System.out.println(ans);
    }
}
