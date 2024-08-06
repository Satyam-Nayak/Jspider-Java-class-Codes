//Write a java program to print the given string into lowercase only alphabets , the lowercase alphabets chnage into uppercase and the uppercase into lowercase
        //output = "hELlo12 hI@ bYe"

public class q3 {
    public static void main(String[] args) {

        //dershan sir method ==========
        String s = "HelLo12 Hi@ ByE";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='A'&& c<='Z') {
                c+=32;
            } else 
            if (c>='a'&& c<='z') {
                c-=32;
        }
        result += c;
        
    }
    System.out.print(result);

}

}

//=======my method=======
// String s = "HelLo12 Hi@ ByE";
// String result = "";
// for (int i = 0; i < s.length(); i++) {
//     char c = s.charAt(i);
//     if (Character.isAlphabetic(c)) {
//         if (Character.isLowerCase(c)) {
//             result += Character.toUpperCase(c);
//         } else {
//             result += Character.toLowerCase(c);
//         }
//     } else {
//         result += c;
//     }            
// }
// System.out.print(result);
