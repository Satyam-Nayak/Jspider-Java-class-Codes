public class explain {
    public static void main(String[] args) {
        int[] arr = new int[128];
        arr['A'] = 100; // Here 'A' is a character, not an integer. The ASCII value of 'A' is 65.
        for(int i =0; i<arr.length; i++){
            System.out.println((char)(i)+ "-"+arr[i]);
            // ASCII values of alphabets are from 65 to 90 (inclusive) and from 97 to 122 (inclusive).
            // So, (char)(i) will print the character corresponding to ASCII value 'i'.
            // arr[i] will print the value assigned to the corresponding ASCII value in the array.
        }
    }
}


// for (int i = 0; i < s.length(); i++) {
//     char c = s.charAt(i);
//     arr[c]++;
// }
