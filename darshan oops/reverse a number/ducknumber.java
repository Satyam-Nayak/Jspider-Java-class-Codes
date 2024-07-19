//write a java program to find the given number is a Duck number or not
// if in the given  numbe have atleast one 0 in it, its called a duck number
//here darshan sir use boolean

public class ducknumber {
    public static void main(String[] args) {
        int n = 2600;
        int rem = 0;
        boolean flag = false;
        while (n != 0) {
            rem = n % 10;
            if (rem == 0) {
                flag = true;
                break;
                }
                n = n / 10;
            }
            System.out.println(flag==true? "Duck Number" : "not a Duck ");
            
    }
}


// public static void main(String[] args) {
//     String number = "1223"; 
//     checkDuckNumber(number);
// }

// public static void checkDuckNumber(String number) {
//     if (number.contains("0") && !number.startsWith("0")) {
//         System.out.println("Number is a duck number: " + number);
//     } else {
//         System.out.println("Number is not a duck number: " + number);
//     }
// }