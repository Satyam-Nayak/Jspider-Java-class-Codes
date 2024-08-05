//count alpha,numeric andspecial charater in the given string
public class q3 {
    public static void main(String[] args) {
        String str = "Hello @ 26";
        int alphac = 0;
        int numericc = 0;
        int speciacharaterc = 0;
        for (int i = 0 ; i< str.length(); i++){
            char ch = str.charAt(i);
            //=======darshan sir method===========
            if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')){
                alphac++;

            } else if ((ch>='0'&& ch<='9')){
                numericc++;
            } else {
                speciacharaterc++;
            }


            //============My method========
            // if(Character.isLetter(ch)){
            //     alphac++;
            // }
            // else if(Character.isDigit(ch)){
            //     numericc++;
            // }
            // else{
            //     speciacharaterc++;
            // }
            
        }
        System.out.println("aplha :"+ alphac);
            System.out.println("numeric :"+ numericc);
            System.out.println("special :"+ speciacharaterc);


    }
    
}
