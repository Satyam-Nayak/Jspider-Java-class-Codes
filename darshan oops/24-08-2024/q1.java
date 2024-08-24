import java.util.regex.Pattern;

class q1{
    public static void main(String[] args) {
        String s = "h1 23 bye 100 hello 200";
        String regex = "[0-9]*";
        String[] arr = s.split(" ");
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(Pattern.matches(regex, arr[i])){
                sum = sum + Integer.parseInt(arr[i]);
            }
        }
        System.out.println(sum);
    }
}