import java.util.ArrayList;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<Integer> myList = new ArrayList<>(10);
//        ArrayList<Integer> myListEven = new ArrayList<>();
//        ArrayList<Integer> myListOdd = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter array element " + (i) + ": ");
//            myList.add(sc.nextInt());
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (myList.get(i) % 2 == 0) {
//                myListEven.add(myList.get(i));
//
//            }
//            else {
//                myListOdd.add(myList.get(i));
//
//            }
//        }
//
//        System.out.println("The even numbers are: ");
//        for (Integer integer : myListEven) {
//            System.out.print(integer + " ");
//        }
//        System.out.println(" ");
//        System.out.println("The odd numbers are: ");
//        for (Integer integer : myListOdd) {
//            System.out.print(integer + " ");
//        }

        double value = 12.56;
        long roundedValue = Math.round(value);
        System.out.println("Rounded value: " + roundedValue);


    }
}
