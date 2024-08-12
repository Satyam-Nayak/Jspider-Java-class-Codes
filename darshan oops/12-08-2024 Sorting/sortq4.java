//write a program to print the string into charater order
// input :- hello
// Output :- h e l l o
import java.util.Arrays;

public class sortq4 {
    public static void main(String[] args) {
        String s = "hello";


        //............. insted of write ing all bello these ..............

        // char[] chara = new char[s.length()];
        
        // for (int i = 0; i < s.length(); i++) {
        //     chara[i] = s.charAt(i);
        // }
        // Arrays.sort(chara);

        char[] chara = s.toCharArray();
        
        
        for (char c : chara) {
            System.out.println(c);
        }
    }   
}
