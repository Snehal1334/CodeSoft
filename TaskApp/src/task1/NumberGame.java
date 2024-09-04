package task1;
import java.util.*;
public class NumberGame {
	public static void main(String[] args) {
        int min = 1, max = 100, maxAttempts = 10, score = 0, rounds = 0;
        Scanner sc = new Scanner(System.in);
        String playAgain;
        
        do {
            Random rand = new Random();
            int randomNumber = rand.nextInt((max - min) + 1) + min;
            int userGuess = 0, attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between 1 to 100: ");
            
            while(attempts < maxAttempts && !guessedCorrectly) {
                userGuess = sc.nextInt();
                attempts++;
                
                if(userGuess < randomNumber) {
                    System.out.println("Too low..Try again: ");
                } else if(userGuess > randomNumber) {
                    System.out.println("Too high..Try again: ");
                } else {
                    System.out.println("Congratulations...! You guessed the number.");
                    guessedCorrectly = true;
                    score++;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've used all attempts. The correct number was: " + randomNumber);
            }

            rounds++;
            System.out.println("Your score: " + score + "/" + rounds);
            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
            
        } while(playAgain.equalsIgnoreCase("yes"));
        
        System.out.println("Thanks for playing! Your final score is " + score + "/" + rounds);
        
    }
}


