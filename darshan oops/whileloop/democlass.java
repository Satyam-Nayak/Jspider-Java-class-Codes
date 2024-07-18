//write a java program to count number of digits in a given number
public class democlass {
    public static void main(String[] args) {
        int num = 1479;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
            }
            System.out.println("Number: " + count);
    }
    
}
