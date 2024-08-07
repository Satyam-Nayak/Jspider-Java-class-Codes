//write a java program 
public class q1 {
    public static void main(String[] args) {
        String s = "Hi12 bye32 67 hi55";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='1' && c<='9') {
                sum =sum+(c-48); 
            }
        }

        System.out.println("sum of numebrs are :- "+sum);
    }
        
    }

