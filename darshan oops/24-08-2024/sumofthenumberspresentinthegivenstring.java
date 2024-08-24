import java.util.regex.Pattern;

public class sumofthenumberspresentinthegivenstring {
    public static void main(String[] args) {
        String s = "Hello hi 23 satyam 100 byee 200";
        String[] arr = s.split(" ");
        int sum = 0;
        for(String ele:arr){
            if (Pattern.matches("[0-9]*", ele)){
                sum = sum + Integer.parseInt(ele);
            }
        }
        System.out.println("sum of the numbers present in the given string: ");
        System.out.println(sum);
    }
}
