//write a java program to get sum of even digits
public class demo {
    public static void main(String[] args) {
        int num = 123456;
        int sum = 0;
        while (num > 0) {
            int rem = num %10;
            if (rem % 2 == 0) {
                sum = sum + rem;
            }
            num = num / 10;
        }
        System.out.println("sum of even digits is " + sum);
            }
        
    }



//darshan sir