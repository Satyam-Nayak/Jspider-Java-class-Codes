//input:- aaaddbbccccd
//output:- a3d2b2c4d1
//using forloop

public class q1testbydarshan {
    
    public static void main(String[] args) {
        String s = "aaaddbbccccd";
        s=s+'\0';
        int count = 1;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                System.out.print(s.charAt(i)+""+count);
                count=1;
        }  
    }
    }
}


// for (int i = 0; i < s.length(); i++) {
//     if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
//         res += s.charAt(i) + String.valueOf(count);
//         count = 1;
//     } else {
//         count++;
//     }
// }

// System.out.println(res);

