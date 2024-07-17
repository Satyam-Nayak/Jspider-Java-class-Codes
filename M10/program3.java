public class program3 {
    public static int square(int num) {
        int result = num * num;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(" main mathod stareds");
        int a = 5;
        int b = 6;
        int result= 0;
        result = square(a) + 2*a*b + square(b);
        System.out.println("result is " + result);
        System.out.println("main method ended");
    }
}
