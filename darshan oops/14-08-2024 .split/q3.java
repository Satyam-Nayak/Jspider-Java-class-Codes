//write a java program to reverse the string only words
//input: hello hi welcome bye
//output: olleh ih emoclew eyb

public class q3 {
    public static void main(String[] args) {
        String s1 = "hello hi welcome bye";
        String[] arr=s1.split(" ");
        String rev="";
        for(int i=0;i<arr.length;i++){
            String revword="";
            for(int j=arr[i].length()-1;j>=0;j--){
                revword+=arr[i].charAt(j);
            }
            rev+=revword+" ";
        }
        System.out.println(rev);
        }
    }
