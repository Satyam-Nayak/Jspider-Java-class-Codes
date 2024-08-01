import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        // Define the choices
        String[] choices = {"rock", "paper", "scissors"};
        
        // Generate a random choice for the computer
        Random random = new Random();
        int computerChoiceIndex = random.nextInt(choices.length);
        String computerChoice = choices[computerChoiceIndex];
        
        // Get the user's choice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice (rock, paper, scissors):");
        String userChoice = scanner.nextLine().toLowerCase();
        
        // Check if the user's choice is valid
        if (!Arrays.asList(choices).contains(userChoice)) {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
            scanner.close();
            return;
        }
        
        // Determine the winner
        String winner;
        if (userChoice.equals(computerChoice)) {
            winner = "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            winner = "You win!";
        } else {
            winner = "Computer wins!";
        }
        
        // Print the results
        System.out.println("User choice: " + userChoice);
        System.out.println("Computer choice: " + computerChoice);
        System.out.println(winner);
    
        scanner.close();
    }
}
