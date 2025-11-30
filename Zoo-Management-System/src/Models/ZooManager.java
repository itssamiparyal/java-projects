package Models;

import java.util.List;
import java.util.Scanner;

public class ZooManager {
    private final List<Animal> animals;
    private final List<Zookeeper> zookeepers;
    private final List<Enclosure> enclosures;
    private final Scanner scanner;

    public ZooManager(List<Animal> animals, List<Zookeeper> zookeepers, List<Enclosure> enclosures, Scanner scanner) {
        this.animals = animals;
        this.zookeepers = zookeepers;
        this.enclosures = enclosures;
        this.scanner = scanner;
    }

    public void addAnimal() {
        System.out.print("Enter species: ");
        String species = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter diet(Carnivore , Herbivore , Omnivore): ");
        String diet = scanner.nextLine();
        System.out.print("Enter health status: ");
        String healthStatus = scanner.nextLine();
        System.out.print("Enter gender (Male , Female): ");
        String gender = scanner.nextLine();
        Enclosure enclosure = null;
        System.out.print("Enter nickname: ");
        String nickname = scanner.nextLine();


        System.out.print("Enter type (Mammal, Bird, Fish, Reptile, Amphibian): ");
        String type = scanner.nextLine().toLowerCase();

        Animal animal = createAnimal(type, species, name, age, diet, healthStatus, gender, enclosure, nickname);
        if (animal != null) {
            animals.add(animal);
            System.out.println("Animal added: " + animal);
        }
    }

    private Animal createAnimal(String type, String species, String name, int age, String diet, String healthStatus, String gender, Enclosure enclosure, String nickname) {
        switch (type) {
            case "mammal":
                System.out.print("Does it have fur? (true/false): ");
                boolean hasFur = scanner.nextBoolean();
                System.out.print("Enter gestation period (days): ");
                int gestationPeriod = scanner.nextInt();
                return new Mammal(species, name, age, diet, healthStatus, gender, enclosure, nickname, hasFur, gestationPeriod);
            case "bird":
                System.out.print("Can it fly? (true/false): ");
                boolean canFly = scanner.nextBoolean();
                System.out.print("Enter wing span (meters): ");
                double wingSpan = scanner.nextDouble();
                return new Bird(species, name, age, diet, healthStatus, gender, enclosure, nickname, canFly, wingSpan);
            case "fish":
                System.out.print("Is it saltwater? (true/false): ");
                boolean isSaltWater = scanner.nextBoolean();
                System.out.print("Enter swim speed (m/s): ");
                double swimSpeed = scanner.nextDouble();
                return new Fish(species, name, age, diet, healthStatus, gender, enclosure, nickname, isSaltWater, swimSpeed);
            case "reptile":
                System.out.print("Is it venomous? (true/false): ");
                boolean isVenomous = scanner.nextBoolean();
                System.out.print("Can it regenerate tail? (true/false): ");
                boolean canRegenerateTail = scanner.nextBoolean();
                return new Reptile(species, name, age, diet, healthStatus, gender, enclosure, nickname, isVenomous, canRegenerateTail);
            case "amphibian":
                System.out.print("Can it live both in water and land? (true/false): ");
                boolean canLiveBoth = scanner.nextBoolean();
                System.out.print("Does it have gills? (true/false): ");
                boolean hasGills = scanner.nextBoolean();
                return new Amphibian(species, name, age, diet, healthStatus, gender, enclosure, nickname, canLiveBoth, hasGills);
            default:
                System.out.println("Invalid type.");
                return null;
        }
    }

    public void addZookeeper() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter experience (years): ");
        int experience = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter assigned animal (name): ");
        String assignedAnimalName = scanner.nextLine();
        Animal assignedAnimal = findAnimalByName(assignedAnimalName);

        System.out.print("Enter shift time: ");
        String shiftTime = scanner.nextLine();

        Zookeeper zookeeper = new Zookeeper(name, age, experience, assignedAnimal, shiftTime);
        zookeepers.add(zookeeper);
        System.out.println("Zookeeper added: " + zookeeper);
    }

    public void addEnclosure() {
        System.out.print("Enter enclosure size (square meters): ");
        double size = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter habitat type: ");
        String habitatType = scanner.nextLine();
        System.out.print("Enter capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Enclosure enclosure = new Enclosure(size, habitatType, capacity);
        enclosures.add(enclosure);
        System.out.println("Enclosure added: " + enclosure);


        System.out.print("Enter animal names to assign to this enclosure (comma-separated): ");
        String[] animalNames = scanner.nextLine().split(",");
        for (String animalName : animalNames) {
            animalName = animalName.trim();
            Animal animal = findAnimalByName(animalName);
            if (animal != null) {
                animal.setEnclosure(enclosure);
                System.out.println("Assigned " + animalName + " to enclosure.");
            } else {
                System.out.println("Animal " + animalName + " not found.");
            }
        }
    }

    public void searchAnimal() {
        System.out.print("Enter animal name to search: ");
        String name = scanner.nextLine();
        Animal animal = findAnimalByName(name);
        if (animal != null) {
            System.out.println("Found: " + animal);
        } else {
            System.out.println("Animal not found.");
        }
    }

    private Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    public void searchZookeeper() {
        System.out.print("Enter zookeeper name to search: ");
        String name = scanner.nextLine();
        Zookeeper zookeeper = findZookeeperByName(name);
        if (zookeeper != null) {
            System.out.println("Found: " + zookeeper);
        } else {
            System.out.println("Zookeeper not found.");
        }
    }

    private Zookeeper findZookeeperByName(String name) {
        for (Zookeeper zookeeper : zookeepers) {
            if (zookeeper.getName().equalsIgnoreCase(name)) {
                return zookeeper;
            }
        }
        return null;
    }

    public void searchEnclosure() {
        System.out.print("Enter enclosure habitat type to search: ");
        String habitatType = scanner.nextLine();
        boolean found = false;

        for (Enclosure enclosure : enclosures) {
            if (enclosure.getHabitatType().equalsIgnoreCase(habitatType)) {
                System.out.println("Found: " + enclosure);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Enclosure not found.");
        }
    }
}
