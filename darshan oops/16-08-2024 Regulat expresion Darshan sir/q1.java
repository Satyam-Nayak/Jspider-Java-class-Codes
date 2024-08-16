import java.util.regex.Pattern;

public class q1 {
    public static void main(String[] args) {
        String s = "9437371311";
        String regex="[6,7,8,9]{1}[0-9]{9}";
        System.out.println(Pattern.matches(regex, s));

    }
}
