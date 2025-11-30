package Models;

public class Bird extends Animal {
    private boolean canFly;
    private double wingSpan;

    public Bird(String species, String name, int age, String diet, String healthStatus, String gender, Enclosure enclosure, String nickname, boolean canFly, double wingSpan) {
        super(species, name, age, diet, healthStatus, gender, enclosure, nickname); // Removed trailing comma
        this.canFly = canFly;
        this.wingSpan = wingSpan;
    }


    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String toString() {
        return super.toString() + ", Can Fly: " + canFly + ", Wing Span: " + wingSpan + " meters";
    }
}
