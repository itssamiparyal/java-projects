import Models.Animal;
import Models.Enclosure;
import Models.ZooManager;
import Models.Zookeeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Animal> animals = new ArrayList<>();
    private static final List<Zookeeper> zookeepers = new ArrayList<>();
    private static final List<Enclosure> enclosures = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final ZooManager zooManager = new ZooManager(animals, zookeepers, enclosures, scanner);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Animal");
            System.out.println("2. Add Zookeeper");
            System.out.println("3. Search Animal");
            System.out.println("4. Search Zookeeper");
            System.out.println("5. Add Enclosure");
            System.out.println("6. Search Enclosure");
            System.out.println("7. Quit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    zooManager.addAnimal();
                    break;
                case 2:
                    zooManager.addZookeeper();
                    break;
                case 3:
                    zooManager.searchAnimal();
                    break;
                case 4:
                    zooManager.searchZookeeper();
                    break;
                case 5:
                    zooManager.addEnclosure();
                    break;
                case 6:
                    zooManager.searchEnclosure();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
