import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    // Enum for the possible choices
    enum Choice {
        ROCK, PAPER, SCISSORS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Introduction
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
        
        // Player input
        String userInput = scanner.nextLine().toUpperCase();
        
        // Validate player input
        Choice playerChoice;
        try {
            playerChoice = Choice.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
            return;
        }

        // Computer makes a choice
        Choice computerChoice = Choice.values()[random.nextInt(Choice.values().length)];
        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        String result = determineWinner(playerChoice, computerChoice);
        System.out.println(result);
    }

    // Method to determine the winner
    public static String determineWinner(Choice player, Choice computer) {
        if (player == computer) {
            return "It's a tie!";
        } else if ((player == Choice.ROCK && computer == Choice.SCISSORS) || 
                   (player == Choice.PAPER && computer == Choice.ROCK) || 
                   (player == Choice.SCISSORS && computer == Choice.PAPER)) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
