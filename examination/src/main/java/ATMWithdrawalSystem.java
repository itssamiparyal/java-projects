import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        int Correct_Pin = 1234;
        int Max_Attempts = 3;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        while (attempts < Max_Attempts) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == Correct_Pin) {
                System.out.println("PIN correct. Access is  granted to you.");
                performTransaction(scanner);
                scanner.close();
                return;
            } else {
                attempts++;
                if (attempts < Max_Attempts) {
                    System.out.println("Incorrect PIN. Try again.");
                }
            }
        }

        System.out.println("Your account  was locked due to too many incorrect attempts.");
        scanner.close();
    }

    public static void performTransaction(Scanner scanner) {
        double balance = 1000.0;
        System.out.println("Welcome to the ATM.");
        System.out.println("Your current balance: $" + balance);
        System.out.println("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid transaction. Insufficient funds or invalid amount.");
        }
    }
}
