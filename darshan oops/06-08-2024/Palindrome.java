//write a java program to find the given string is palindrom or not

//=================== with using boolaen======
// public class palindrom {
//     public static void main(String[] args) {
//         String str = "somos";
//         int left = 0;
//         int right = str.length() - 1;
//         boolean isPalindrome = true;
        
//         while (left < right) {
//             if (str.charAt(left)!= str.charAt(right)) {
//                 isPalindrome = false;
//                 break;
//             }
//             left++;
//             right--;
//     }
    
//     if (isPalindrome) {
//         System.out.println(str + " is a palindrome");
//     } else{
//         System.out.println(str+ " is not a palindrom");
//     }


// }
// }

//===================with out using boolaen======
public class Palindrome {
    public static void main(String[] args) {
        String str = "somos";
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println(str + " is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str + " is a palindrome");
    }
}

