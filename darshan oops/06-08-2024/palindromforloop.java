// Write a java program to check the given string is palindrom or not using for loop 

public class palindromforloop {
    public static void main(String[] args) {
        String s = "HELLEH";
        String rev ="";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if(rev.equals(s)){
            System.out.println(s + " is a palindrome");
        }
        else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
