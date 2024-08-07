//write a java program to print the given string into reverse
public class q2reverse {
    public static void main(String[] args) {
        String s="hello";
        String rev="";
        for(int i =0; i<s.length();i++){
            rev = s.charAt(i) + rev;
        }
        System.out.println("Reversed string: " + rev);
    }
}
