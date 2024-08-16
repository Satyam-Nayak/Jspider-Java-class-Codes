// write a regular expresion for this 3 to 5 charater is alpha next "#" present then 2 to 4 charaters are numeric after that @gmail.com

import java.util.regex.Pattern;

public class q2 {
    public static void main(String[] args) {
        String str = "jena####1234@gmail.com";
        String regex = "[A-Z,a-z]{3,5}#*[0-9]{2,4}@gmail[.]com";
        System.out.println(Pattern.matches(regex, str));
    }
    
}
