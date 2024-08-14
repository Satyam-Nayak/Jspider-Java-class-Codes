//write a java program to reverse the string without reversing the words
//input: hello hi welcome bye
//output: bye welcome hi hello

public class q2 {
    public static void main(String[] args) {
        String s1 = "hello hi welcome bye";
        String[] arr=s1.split(" ");
        String rev="";
        for(int i=arr.length-1;i>=0;i--){
            rev+=arr[i]+" ";
            }
            System.out.println(rev);
        }
    }

