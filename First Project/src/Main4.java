//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Arrays;
//
//
//public class Main4 {
//    public static void main(String[] args) {
//
////        int[] array = {10,20,30};
////        int[] array2 = new int[3];
////        array2[0] = 10;
////        array2[1] = 20;
////        array2[2] = 30;
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter array length: ");
////        int n = scanner.nextInt();
////
////        int[] array = new int[n];
////
////        for (int i = 0; i < n; i++) {
////            System.out.print("Enter array element " + (i) + ": ");
////            array[i] = scanner.nextInt();
////        }
////
////        System.out.println(Arrays.toString(array));
//
//        Scanner sc = new Scanner(System.in);
////        System.out.print("Enter the number of elements: ");
////        int n = sc.nextInt();
////
////        ArrayList<Integer> myList = new ArrayList<>(n);
////        for (int i = 0; i < n; i++) {
////            System.out.print("Enter array element " + (i) + ": ");
////            myList.add(sc.nextInt());
////        }
////
////
////        // for (Integer e : myList) {
////        //     System.out.println(e);
////        // }
////
//////        for (int i = 0; i < n; i++) {
//////            System.out.print(myList.get(i)+" ");
//////        }
//
////        Scanner sc = new Scanner(System.in);
////        System.out.print("Enter the size of the array: ");
////        int n = sc.nextInt();
////
////        int sumEven = 0;
////        int sumOdd = 0;
////
////        ArrayList<Integer> myList = new ArrayList<>(n);
////        ArrayList<Integer> myListEven = new ArrayList<>();
////        ArrayList<Integer> myListOdd = new ArrayList<>();
////        for (int i = 0; i < n; i++) {
////            System.out.print("Enter array element " + (i) + ": ");
////            myList.add(sc.nextInt());
////        }
////
////        for (int i = 0; i < n; i++) {
////            if (myList.get(i) % 2 == 0) {
////                myListEven.add(myList.get(i));
////                sumEven += myList.get(i);
////            }
////            else {
////                myListOdd.add(myList.get(i));
////                sumOdd += myList.get(i);
////            }
////        }
////        if (sumEven == sumOdd) {
////            System.out.println("Sum of even and odd elements are equal");
////        }
////        else if (sumEven > sumOdd) {
////            System.out.println("Sum of even is grater than odd");
////        }
////        else if (sumEven < sumOdd) {
////            System.out.println("Sum of odd is grater than even");
////        }
////        System.out.println("The even numbers are: ");
////        for (Integer integer : myListEven) {
////            System.out.print(integer + " ");
////        }
////        System.out.println(" ");
////        System.out.println("The odd numbers are: ");
////        for (Integer integer : myListOdd) {
////            System.out.print(integer + " ");
////        }
//
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
//    }
//}
//
//
