//write a java program to print the given string by removing extra space in the given string 
// input:-"hi  hello bye  hi"
//output:-"hi hello bye hi"
public class q3 {
    public static void main(String[] args) {
        String s= "hi  hello bye  hi";
        String s1="";
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)==' '){
                continue;
            }
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}

//we can also do that using boolean flag = false;
