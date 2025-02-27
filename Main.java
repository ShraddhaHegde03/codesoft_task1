//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.*;
        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                boolean playAgain = true;

                while (playAgain) {
                    int randomNumber = random.nextInt(100) + 1; // Generate a number between 1 and 100
                    int attempts = 0;
                    int maxAttempts = 10; // Limiting attempts
                    boolean guessedCorrectly = false;

                    System.out.println("Welcome to the Number Guessing Game!");
                    System.out.println("Try to guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

                    while (attempts < maxAttempts) {
                        System.out.print("Enter your guess: ");
                        int userGuess = scanner.nextInt();
                        attempts++;

                        if (userGuess == randomNumber) {
                            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                            guessedCorrectly = true;
                            break;
                        } else if (userGuess > randomNumber) {
                            System.out.println("Too high! Try again.");
                        } else {
                            System.out.println("Too low! Try again.");
                        }
                    }

                    if (!guessedCorrectly) {
                        System.out.println("You've used all your attempts! The correct number was: " + randomNumber);
                    }

                    // Ask user if they want to play again
                    System.out.print("Do you want to play again? (yes/no): ");
                    String response = scanner.next().toLowerCase();
                    playAgain = response.equals("yes");
                }

                System.out.println("Thank you for playing! Goodbye.");
                scanner.close();
            }
        }
