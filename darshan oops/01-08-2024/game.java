import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String[] arr={"Rock","Papper","Scissor"};
        int p=0;
        int c=0;
        System.out.println("===========Welcome to RPS game==========");
        System.out.println("Enter the total points:- ");
        int t = ip.nextInt();
        int i = 1;
        System.out.println("===============Game Starts=========");
        while (true) {
            System.out.println("=====Round " + i + "======");
            System.out.println("Playerrs turn:- ");
            String pi = ip.next();
            int index = (int)(Math.random()*3);
            String ci = arr[index];
            System.out.println("player: "+pi+ " computer"+ ci);
            if((pi.equals("Rock") && ci.equals("Scissor") && ))
            

        }
    }
}
