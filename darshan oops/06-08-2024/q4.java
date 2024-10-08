//String = "Hi12 bye32 67 hi55"
//Output:- 31
//Explanation:- The string contains three numbers. The sum of these numbers is 31.
//example: 1+2+3+2+6+7+5+5

public class q4 {
    public static void main(String[] args) {
                String s = "Hi12 bye32 67 hi55";
                int sum = 0;
        
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c>='1' && c<='9') {
                        sum += c - '0'; 
                    }
                }
                System.out.println("sum of numebrs are :- "+sum);
            }
        }
        