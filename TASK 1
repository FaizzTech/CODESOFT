import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5; // Number of attempts allowed
        int score = 0; // Number of rounds won
        
        boolean playAgain = true;
        while (playAgain) {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Guess the number between " + minRange + " and " + maxRange + ":");
            
            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.println("Attempt " + attempt + ":");
                int userGuess = scanner.nextInt();
                
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
                
                if (attempt == attempts) {
                    System.out.println("Out of attempts. The correct number was: " + generatedNumber);
                }
            }
            
            System.out.println("Your score: " + score);
            System.out.println("Do you want to play again? (yes/no):");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
