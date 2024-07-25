import java.util.Scanner;


public class simplecalsi {
    
        static int add(int n1, int n2){
            return  n1+n2;
        }
        static int sub(int n1, int n2){
            return  n1-n2;
        }
        static int mul(int n1, int n2){
            return  n1*n2;
        }
        static int div(int n1, int n2){
            return  n1/n2;
        }
        static int mod(int n1, int n2){
            return  n1%n2;
        }
        
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("=========welcom calci==========");
        while (true) {
            System.out.println("=======Menu=======");
            System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod\n6.exit");
            System.out.println("enter your choice");
            int ch = ip.nextInt();
            int n1=0,n2=0;
            if (ch>=1 && ch<=5) {
                System.out.println("enter 1st number");
                n1 = ip.nextInt();
                System.out.println("enter 2nd number");
                n2 = ip.nextInt();
                
            }
            switch (ch) {
                case 1:System.out.println("add:"+ add(n1,n2));
                break;
                case 2:System.out.println("sub:" + sub(n1,n2));
                break;
                case 3:System.out.println("mul:" + mul(n1,n2));
                break;
                case 4:System.out.println("div:" + div(n1,n2));
                break;
                case 5:System.out.println("mod:" + mod(n1,n2));
                break;
                case 6:System.out.println("Thank you.......");
                System.exit(0);
                default:System.out.println("invalid options.........");
            // break;
            
        }
    }
    
    }}
