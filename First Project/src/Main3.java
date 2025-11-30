import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPin = "1234";
        int attempts = 4;

        while (attempts > 0) {
            System.out.print("Enter your PIN: ");
            String enteredPin = scanner.nextLine();

            if (enteredPin.equals(correctPin)) {
                System.out.println("the entered PIN is correct, access granted.");
                return;
            } else {
                attempts -= 1;
                System.out.println("Incorrect PIN. You have " + attempts + " attempts left.");
            }
        }
        System.out.println("Too many incorrect attempts. Access denied.");
    }
}
//
//
//
////        Scanner scanner = new Scanner(System.in);
////        boolean isCarStarted = false;
////
////        while (true) {
////            System.out.print("Enter a task (start, stop, quit): ");
////            String task = scanner.nextLine();
////
////            switch (task) {
////                case "start":
////                    if (isCarStarted) {
////                        System.out.println("Car is already started.");
////                    } else {
////                        isCarStarted = true;
////                        System.out.println("Car started.");
////                    }
////                    break;
////                case "stop":
////                    if (!isCarStarted) {
////                        System.out.println("Car is already stopped.");
////                    } else {
////                        isCarStarted = false;
////                        System.out.println("Car stopped.");
////                    }
////                    break;
////                case "quit":
////                    System.out.println("Exiting the game.");
////                    return; // Exit the program
////                default:
////                    System.out.println("Invalid command.");
////                    break;
////            }
////        }
////    }
////}
////
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter number between 1 and 100:");
////        int numberToBeGuess = scanner.nextInt();
////        int numberOfAttemps = 0;
////        boolean hasGuessedCorrectly = false;
////
////        System.out.println("Guess a number between 1 and 100:");
////
////        while (!hasGuessedCorrectly) {
////            System.out.print("Enter your guess: ");
////            int guess = scanner.nextInt();
////            numberOfAttemps+=1;
////
////            if (guess < numberToBeGuess) {
////                System.out.println("Hot.");
////            } else if (guess > numberToBeGuess) {
////                System.out.println("Cold");
////            } else {
////                hasGuessedCorrectly = true;
////                System.out.println("Congratulations! You've guessed the correct number in " + numberOfAttemps + " tries.");
////            }
////        }
////    }
////}
