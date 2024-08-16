import java.util.regex.Pattern;

public class q1 {
    public static void main(String[] args) {
        String s= "saty123";
        String regex = "[a-z,A-Z]{4}[0-9]{3}";
        System.out.println(Pattern.matches(regex, s));
    }
}

//to check the given string have 4 alphabet and 3 numeric