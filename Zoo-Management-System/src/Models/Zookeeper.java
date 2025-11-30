package Models;

public class Zookeeper {
    private String name;
    private int age;
    private int experience;
    private String assignedAnimal;
    private String shiftTime;

    public Zookeeper(String name, int age, int experience, Animal assignedAnimal, String shiftTime) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.assignedAnimal = String.valueOf(assignedAnimal);
        this.shiftTime = shiftTime;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAssignedAnimal() {
        return assignedAnimal;
    }

    public void setAssignedAnimal(String assignedAnimal) {
        this.assignedAnimal = assignedAnimal;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }


    public String toString() {
        return "Zookeeper [Name: " + name + ", Age: " + age + ", Experience: " + experience +
                " years, Assigned Animal: " + assignedAnimal + ", Shift: " + shiftTime + "]";
    }
}
