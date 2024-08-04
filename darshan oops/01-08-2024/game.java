import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String[] arr = {"Rock", "Paper", "Scissors"};
        int playerScore = 0;
        int computerScore = 0;
        
        System.out.println("=========== Welcome to the RPS Game ===========");
        System.out.println("Enter the number of rounds you want to play: ");
        int totalRounds = ip.nextInt();
        
        System.out.println("=============== Game Starts ===============");
        
        for (int i = 1; i <= totalRounds; i++) {
            System.out.println("===== Round " + i + " =====");
            System.out.println("Player's turn: ");
            String playerInput = ip.next();
            
            int index = (int) (Math.random() * 3);
            String computerInput = arr[index];
            System.out.println("Player: " + playerInput + " | Computer: " + computerInput);
            
            if (playerInput.equals(computerInput)) {
                System.out.println("It's a tie!");
            } else if ((playerInput.equals("Rock") && computerInput.equals("Scissors")) ||
                       (playerInput.equals("Paper") && computerInput.equals("Rock")) ||
                       (playerInput.equals("Scissors") && computerInput.equals("Paper"))) {
                System.out.println("Player wins this round!");
                playerScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }
        }
        
        System.out.println("=============== Game Over ===============");
        System.out.println("Player Score: " + playerScore);
        System.out.println("Computer Score: " + computerScore);
        
        if (playerScore > computerScore) {
            System.out.println("Player is the overall winner!");
        } else if (computerScore > playerScore) {
            System.out.println("Computer is the overall winner!");
        } else {
            System.out.println("The game is a tie!");
        }
        
        ip.close();
    }
}



// import java.util.Scanner;

// public class game {
//     public static void main(String[] args) {
//         Scanner ip = new Scanner(System.in);
//         String[] arr={"Rock","Papper","Scissor"};
//         int p=0;
//         int c=0;
//         System.out.println("===========Welcome to RPS game==========");
//         System.out.println("Enter the total points:- ");
//         int t = ip.nextInt();
//         int i = 1;
//         System.out.println("===============Game Starts=========");
//         while (true) {
//             System.out.println("=====Round " + i + "======");
//             System.out.println("Playerrs turn:- ");
//             String pi = ip.next();
//             int index = (int)(Math.random()*3);
//             String ci = arr[index];
//             System.out.println("player: "+pi+ " computer"+ ci);
//             if((pi.equals("Rock") && ci.equals("Scissor") && ))
            

//         }
//     }
// }
