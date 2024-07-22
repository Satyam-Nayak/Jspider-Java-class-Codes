

//write a java program to print the given number is palindrome or not
import java.util.Scanner;
public class palendrom {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sn.nextInt();
        int num1=num;
        int rev = 0;
        while(num!=0 || num >0){ //we can use both ((num!=0 || num >0) also &&)
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(num1==rev){
        System.out.println("palendrom");
        }
        else{
            System.out.println("not palendrom");
        }
        sn.close();

    }
    
}
