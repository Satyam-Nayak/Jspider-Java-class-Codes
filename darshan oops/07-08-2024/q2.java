//write a java program to print the given char 452 as 
//output: FourFiveTwo
public class q2 {
    public static void main(String[] args) {
        String s = "12380";
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c - '0';
            result += words[num];
        }
        System.out.println(result);
    }
}
