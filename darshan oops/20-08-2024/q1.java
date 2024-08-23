//input:- aaaddbbccccd
//output:- a3d2b2c4d1

public class q1 {
    public static void main(String[] args) {
        String s = "aaabbccccaaaadd";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 1;

            while (i + 1 < s.length() && s.charAt(i + 1) == c) {
                count++;
                i++;
            }

            res += c + String.valueOf(count);
        }

        System.out.println(res);
    }
}
