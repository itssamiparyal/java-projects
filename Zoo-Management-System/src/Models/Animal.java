package Models;

public class Animal {
    private String name;
    private int age;
    private String diet;
    private String healthStatus;
    private String gender;
    private Enclosure enclosure;
    private String nickname;
    private Zookeeper assignedZookeeper;
    private String species;


    public Animal(String species, String name, int age, String diet, String healthStatus, String gender, Enclosure enclosure, String nickname) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.diet = diet;
        this.healthStatus = healthStatus;
        this.gender = gender;
        this.enclosure = enclosure;
        this.nickname = nickname;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Zookeeper getAssignedZookeeper() {
        return assignedZookeeper;
    }

    public void setAssignedZookeeper(Zookeeper assignedZookeeper) {
        this.assignedZookeeper = assignedZookeeper;
    }

    public  String toString() {
        return species + " named " + name + " (Nickname: " + nickname + "), Age: " + age +
                ", Diet: " + diet + ", Health: " + healthStatus + ", Gender: " + gender +
                ", Enclosure: " + (enclosure != null ? enclosure.getHabitatType() : "None") +
                (assignedZookeeper != null ? ", Zookeeper: " + assignedZookeeper.getName() : "");
    }
}
