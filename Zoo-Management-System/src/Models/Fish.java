package Models;

public class Fish extends Animal {
    private boolean isSaltWater;
    private double swimSpeed;

    public Fish(String species, String name, int age, String diet, String healthStatus, String gender, Enclosure enclosure, String nickname, boolean isSaltWater, double swimSpeed) {
        super(species, name, age, diet, healthStatus, gender, enclosure, nickname); // Added species
        this.isSaltWater = isSaltWater;
        this.swimSpeed = swimSpeed;
    }


    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public String toString() {
        return super.toString() + ", Salt Water: " + isSaltWater + ", Swim Speed: " + swimSpeed + " m/s";
    }
}
