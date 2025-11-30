package Models;

public class Amphibian extends Animal {
    private boolean canLiveBothInWaterAndLand;
    private boolean hasGills;


    public Amphibian(String species, String name, int age, String diet, String healthStatus, String gender, Enclosure enclosure, String nickname, boolean canLiveBothInWaterAndLand, boolean hasGills) {
        super(species, name, age, diet, healthStatus, gender, enclosure, nickname);
        this.canLiveBothInWaterAndLand = canLiveBothInWaterAndLand;
        this.hasGills = hasGills;
    }

    public boolean canLiveBothInWaterAndLand() {
        return canLiveBothInWaterAndLand;
    }

    public void setCanLiveBothInWaterAndLand(boolean canLiveBothInWaterAndLand) {
        this.canLiveBothInWaterAndLand = canLiveBothInWaterAndLand;
    }

    public boolean hasGills() {
        return hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }


    public String toString() {
        return super.toString() + ", Can Live Both in Water and Land: " + canLiveBothInWaterAndLand + ", Has Gills: " + hasGills;
    }
}
