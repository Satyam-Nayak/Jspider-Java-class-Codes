public class program2 {
    public static int squre(int num) {
        int result = num * num;
        return result;
        
    }
    public static void main(String[] args) {
        {
            System.out.println(" main mathod started");
            int x =squre(6);
            System.out.println("square of 6 is "+x);
            int y = squre(8);
            System.out.println("square of 8 is "+y);
            System.out.println(" main mathod ended");
        }
}
}