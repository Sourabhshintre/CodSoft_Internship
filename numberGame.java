import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minimumRange = 1;
        int maximummumRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Hello!,Welcome to the Number Guessing Game!");

        do {
            int target = random.nextInt(maximummumRange - minimumRange + 1) + minimumRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I've selected a random number between " + minimumRange + " and " + maximummumRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == target) {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the correct number: " + target);
                    break;
                } else if (userGuess < target) {
                    System.out.println("Your guess is too low. Please Try again.");
                } else {
                    System.out.println("Your guess is too high. Please Try again.");
                }
            }

            if (hasGuessedCorrectly) {
                score++;
            } else {
                System.out.println("You've run out of attempts. The correct number was: " + target);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

        } while (true);

        System.out.println("Thank you for playing! Your final score: " + score);
        scanner.close();
    }
}
