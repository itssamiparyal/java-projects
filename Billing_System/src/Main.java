import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUserName = "abc";
        String correctPassword = "1234";
        int numOfAttempts = 4;

        while (true) {
            System.out.print("Enter a task (start, quit): ");
            String task = scanner.nextLine();
            String Task = task.trim().toLowerCase();

            if (Task.equals("start")) {
                while (numOfAttempts > 0) {
                    System.out.print("Enter your Username: ");
                    String enteredUsername = scanner.nextLine();
                    System.out.print("Enter your Password: ");
                    String enteredPassword = scanner.nextLine();

                    if (enteredUsername.equals(correctUserName) && enteredPassword.equals(correctPassword)) {
                        System.out.println("Username and password are correct!");

                        ArrayList<String> ItemsName = new ArrayList<>();
                        ArrayList<Integer> ItemsPrice = new ArrayList<>();
                        int TotalSumOfItems = 0;

                        System.out.print("Enter number of items purchased: ");
                        int noOfItems = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline

                        for (int i = 0; i < noOfItems; i++) {
                            System.out.print("Enter name of Item " + (i + 1) + ": ");
                            ItemsName.add(scanner.nextLine());
                            System.out.print("Enter price of Item " + (i + 1) + ": ");
                            ItemsPrice.add(scanner.nextInt());
                            TotalSumOfItems += ItemsPrice.get(i);
                            scanner.nextLine(); // Consume the newline
                        }


                        int VatPercentage = 0;
                        while (true) {
                            System.out.print("Is VAT to be charged (Y/N): ");
                            String isVat = scanner.nextLine();
                            String IsVat = isVat.trim().toLowerCase();

                            if (IsVat.equals("y")) {
                                VatPercentage = 13;
                                break;
                            } else if (IsVat.equals("n")) {
                                break;
                            } else {
                                System.out.println("Enter correct input (Y/N).");
                            }
                        }

                        int discountPercentage;
                        while (true) {
                            System.out.print("Input a discount percentage based on your membership: ");
                            int discount = scanner.nextInt();

                            if (discount < 100 && discount >= 0) {
                                discountPercentage = discount;
                                break;
                            } else {
                                System.out.println("Enter correct discount percentage (0% - <100%): ");
                            }
                        }

                        double totalWithVAT = TotalSumOfItems * (1 + VatPercentage / 100.0);
                        double totalWithDiscountAndVat = totalWithVAT * (1 - discountPercentage / 100.0);

                        long roundedTotalWithVAT = Math.round(totalWithVAT);
                        long roundedTotalWithDiscountAndVat = Math.round(totalWithDiscountAndVat);

                        System.out.println("The items you have purchased are :");
                        for (int i = 0; i < noOfItems; i++) {
                            System.out.println("Item " + (i + 1) + ": " + ItemsName.get(i) + " - Price: " + ItemsPrice.get(i));
                        }

                        System.out.println("Total sum of items: " + TotalSumOfItems);
                        System.out.println("Total with VAT: " + roundedTotalWithVAT);
                        System.out.println("Total with VAT and Discount: " + roundedTotalWithDiscountAndVat);

                        while (true) {
                            System.out.print("Enter Amount of money paid by " + correctUserName + ": ");
                            int paidAmount = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline

                            int returnAmount = (int) (paidAmount - roundedTotalWithDiscountAndVat);
                            if (returnAmount >= 0) {
                                System.out.println("Change to be returned: " + returnAmount);
                                if (returnAmount > 0) {
                                    if (returnAmount >= 1000) {
                                        int amount = returnAmount / 1000;
                                        System.out.println("1000 - " + amount);
                                        returnAmount -= amount * 1000;
                                    }
                                    if (returnAmount >= 500) {
                                        int amount = returnAmount / 500;
                                        System.out.println("500 - " + amount);
                                        returnAmount -= amount * 500;
                                    }
                                    if (returnAmount >= 100) {
                                        int amount = returnAmount / 100;
                                        System.out.println("100 - " + amount);
                                        returnAmount -= amount * 100;
                                    }
                                    if (returnAmount >= 50) {
                                        int amount = returnAmount / 50;
                                        System.out.println("50 - " + amount);
                                        returnAmount -= amount * 50;
                                    }
                                    if (returnAmount >= 20) {
                                        int amount = returnAmount / 20;
                                        System.out.println("20 - " + amount);
                                        returnAmount -= amount * 20;
                                    }
                                    if (returnAmount >= 10) {
                                        int amount = returnAmount / 10;
                                        System.out.println("10 - " + amount);
                                        returnAmount -= amount * 10;
                                    }
                                    if (returnAmount >= 5) {
                                        int amount = returnAmount / 5;
                                        System.out.println("5 - " + amount);
                                        returnAmount -= amount * 5;
                                    }
                                    if (returnAmount > 0) {
                                        System.out.println("Remaining change - " + returnAmount);
                                    }
                                }
                                break;
                            } else {
                                System.out.println("You don't have enough money.");
                            }
                        }

                        break;
                    } else {
                        numOfAttempts -= 1;
                        System.out.println("Incorrect Username or password. You have " + numOfAttempts + " attempts left.");
                    }
                }
                if(numOfAttempts <= 0){
                    System.out.println("Too many incorrect attempts. Access denied.");
                    numOfAttempts = 4;
                }


            } else if (Task.equals("quit")) {
                System.out.println("Exiting the Billing System.");
                return;
            } else {
                System.out.println("Invalid Input.");
            }
        }
    }
}
