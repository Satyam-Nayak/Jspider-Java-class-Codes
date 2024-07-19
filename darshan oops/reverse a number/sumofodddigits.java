public class sumofodddigits {
    public static void main(String[] args) {
        int num = 12346;
        int sum = 0;
        while (num > 0) {
            int rem = num %10;
            if (rem % 2 != 0) {
                sum = sum + rem;
            }
            num = num / 10;
        }
        System.out.println("sum of odd digits is " + sum);
            }
}
