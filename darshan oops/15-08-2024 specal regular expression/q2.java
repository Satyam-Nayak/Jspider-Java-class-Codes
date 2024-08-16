import java.util.regex.Pattern;

public class q2 {
    public static void main(String[] args) {
        String s= "@2@s5t";
        String regex = "[a-z,A-Z]{4,6}[0-9]{2,5}.*";
        System.out.println(Pattern.matches(regex, s));
    }
}

//to check the given string have 4 alphabet and 3 numeric