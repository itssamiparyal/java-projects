import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
////        int num1 = 23;
////        if(num1 == 0){
////            System.out.println("the number is zero");
////        }
////        else if(num1 % 2 == 0){
////            System.out.println("the number is even");
////        }
////        else{
////            System.out.println("the number is odd");
////        }
//
////        int age = -23;
////        if(age >= 18 && age <= 118){
////            System.out.println("you can vote");
////        }
////        else if (age < 18 && age > 0) {
////            System.out.println("you can't vote");
////        }
////        else{
////            System.out.println("enter valid age");
////        }
//
////        Scanner object = new Scanner(System.in);
////        System.out.print("Enter number:");
////        int num = object.nextInt();
////
////        if(num % 3 == 0 && num % 5 == 0){
////            System.out.println("Fizz Buzz");
////        }
////        else if (num % 3 == 0) {
////            System.out.println("Fizz");
////        }
////        else if (num % 5 == 0) {
////            System.out.println("Buzz");
////        }
////        else {
////            System.out.println(num);
////        }
//

        Scanner object = new Scanner(System.in);
        System.out.print("Enter money: ");
        int money = object.nextInt();
        if (money >= 1000) {
            int amount = money / 1000;
            System.out.println("1000 -" + " " + amount);
            money = money - (amount * 1000);
        }
        if (money >= 500) {
            int amount = money / 500;
            System.out.println("500 -" + " " + amount);
            money = money - (amount * 500);
        }
        if (money >= 100) {
            int amount = money / 100;
            System.out.println("100 -" + " " + amount);
            money = money - (amount * 100);
        }
        if (money >= 50) {
            int amount = money / 50;
            System.out.println("50 -" + " " + amount);
            money = money - (amount * 50);
        }
        if (money >= 20) {
            int amount = money / 20;
            System.out.println("20 -" + " " + amount);
            money = money - (amount * 20);
        }
        if (money >= 10) {
            int amount = money / 10;
            System.out.println("10 -" + " " + amount);
            money = money - (amount * 10);
        }
        if (money >= 5) {
            int amount = money / 5;
            System.out.println("5 -" + " " + amount);
            money = money - (amount * 5);
            System.out.println(money);
        }
    }
}

//
//
////                Scanner object = new Scanner(System.in);
////                System.out.println("Enter the amount: ");
////                int amount = object.nextInt();
////
////                if (amount > 1000){
////                    int r = amount/1000;
////                    amount = amount%1000;
////                    System.out.println("1000 * "+r);
////                    r = 0;
////                }
////                if (amount > 500 && amount < 1000){
////                    int r = amount/500;
////                    amount = amount%500;
////                    System.out.println("500 * "+r);
////                    r = 0;
////                }
////                if (amount > 100 && amount < 500){
////                    int r = amount/100;
////                    amount = amount%100;
////                    System.out.println("100 * "+r);
////                    r = 0;
////                }
////                if (amount > 50 && amount < 100){
////                    int r = amount/50;
////                    amount = amount%50;
////                    System.out.println("50 * "+r);
////                    r = 0;
////                }
////                if (amount > 20 && amount < 50){
////                    int r = amount/20;
////                    amount = amount%20;
////                    System.out.println("20 * "+r);
////                    r = 0;
////                }
////                if (amount > 10 && amount < 20){
////                    int r = amount/10;
////                    amount = amount%10;
////                    System.out.println("10 * "+r);
////                    r = 0;
////
////                }
////                if (amount > 5 && amount < 10){
////                    int r = amount/5;
////                    amount = amount%5;
////                    System.out.println("5 * "+r);
////                    r = 0;
////                }
//
//
////    }
//
//    }
////}
