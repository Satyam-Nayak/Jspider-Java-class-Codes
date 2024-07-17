public class program4 {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("main method started");
        boolean result = isEven(11);
        System.out.println("result: " + result);
        System.out.println("main method ended");
    }
}
