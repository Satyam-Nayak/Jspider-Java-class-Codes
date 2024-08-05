public class q4 {
    public static void main(String[] args) {
        String s ="Satyam Nayak SATYAM NAYAK";
        s=s.toLowerCase();
int v=0;
for(int i = 0; i<s.length(); i++){
    char c= s.charAt(i);
    if((c=='a') || (c=='i')||(c=='e')|| (c=='o')||(c=='u')){
        v++;
    }
}
System.out.println("vowels are: " + v);
        // int v= 0;
        // for(int i = 0; i<s.length(); i++){
        //     char c= s.charAt(i);
        //     if((c=='a') || (c=='i')||(c=='e')|| (c=='o')||(c=='u') || (c=='A') || (c=='E')||(c=='I')|| (c=='O')||(c=='U')){
        //         v++;
        //     }
        // }
        // System.out.println("vowels are: " + v);
    }
}


// Sirs method
// String s = "Hello";
// s=s.toLowerCase();
// int v=0;
// for(int i = 0; i<s.length(); i++){
//     char c= s.charAt(i);
//     if((c=='a') || (c=='i')||(c=='e')|| (c=='o')||(c=='u')){
//         v++;
//     }
// }
// System.out.println("vowels are: " + v);

