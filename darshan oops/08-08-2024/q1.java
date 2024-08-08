//write a java progrma to print the string in partial reverse
//example
//input : "Hello"
//output : "Heoll"

public class q1 {
    public static void main(String[] args) {
        String s = "Satyam";
        String s1="";
        String s2="";
        for(int i=0;i<=(s.length()/2)-1;i++){
            s1=s1+s.charAt(i);
        }
        for(int i=s.length()-1;i>(s.length()/2)-1;i--){
            s2=s2+s.charAt(i);
        }
    
        System.out.println(s1+s2);


    }
}
