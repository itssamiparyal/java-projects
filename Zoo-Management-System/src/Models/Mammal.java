package Models;

public class Mammal extends Animal {
    private boolean hasFur;
    private int gestationPeriod;

    public Mammal(String species, String name, int age, String diet, String healthStatus, String gender, Enclosure enclosure, String nickname, boolean hasFur, int gestationPeriod) {
        super(species, name, age, diet, healthStatus, gender, enclosure, nickname); // Added species
        this.hasFur = hasFur;
        this.gestationPeriod = gestationPeriod;
    }


    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public int getGestationPeriod() {
        return gestationPeriod;
    }

    public void setGestationPeriod(int gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Fur: " + hasFur + ", Gestation Period: " + gestationPeriod + " days";
    }
}
