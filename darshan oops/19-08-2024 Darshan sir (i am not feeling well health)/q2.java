//wrte a java program to print the given string with the values to print the charater with given values
//input:- a3d2b2c4d1
//output:- aaaddbbccccd

public class q2 {
    public static void main(String[] args) {
        String s = "a3d2b2c4d1";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            int count = s.charAt(i+1) - 48; 
            for (int j = 0; j < count; j++) {
                System.out.print(c); // Print the character 'count' times
                        }
                        i++; // Skip the digit
                    }
    }
}
