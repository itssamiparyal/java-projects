import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSalaries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();
        int Employee_Count = 5;

        System.out.println("Enter salaries of " + Employee_Count + " employees:");
        for (int i = 0; i < Employee_Count; i++) {
            System.out.print("Salary " + (i + 1) + ": ");
            salaries.add(scanner.nextDouble());
        }


        double totalSalary = 0;
        for (double salary : salaries) {
            totalSalary += salary;
        }
        double averageSalary = totalSalary / Employee_Count;


        String category;
        if (averageSalary < 3000) {
            category = "Low Salary";
        } else if (averageSalary <= 7000) {
            category = "Medium Salary";
        } else {
            category = "High Salary";
        }


        System.out.println("\nAverage Salary: $" + averageSalary);
        System.out.println("Salary Category: " + category);

        scanner.close();
    }
}
