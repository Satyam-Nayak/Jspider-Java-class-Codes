//write a java program to reverse only even index element
//input: abcd hi bye hello welcome
//output: dcba hi eyb hello emoclew

public class q4 {

    static String reverse(String s){
        String rev="";
        for(int i =s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String s1 = "abcd hi bye hello welcome";
        String[] arr=s1.split(" ");
        for(String ele:arr){
            System.out.println(reverse(ele)+" ");
        }
        }
    }
