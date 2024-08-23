//string :- Jspiders
//Output:- 
//Jspiders
//Jspider
//spider
//spide
//pide
//pid
//id
//i

public class q2 {
    public static void main(String[] args) {
        String s = "Jspiders";
        int l = 0;
        int r = s.length()-1;
        System.out.println(s);
        System.out.println("===========");
        for(int i =0; i<s.length();i++){
            if(i%2==0){
                r--;
            }
            else{
                l++;
            }
            String t="";
            for(int j = l; j<=r;j++){
                t+=s.charAt(j);
            }
            System.out.println(t);
        }
    }
}


    

