package Models;

public class Reptile extends Animal {
    private boolean isVenomous;
    private boolean canRegenerateTail;

    public Reptile(String species, String name, int age, String diet, String healthStatus, String gender, Enclosure enclosure, String nickname, boolean isVenomous, boolean canRegenerateTail) {
        super(species, name, age, diet, healthStatus, gender, enclosure, nickname); // Added species
        this.isVenomous = isVenomous;
        this.canRegenerateTail = canRegenerateTail;
    }


    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean isVenomous) {
        this.isVenomous = isVenomous;
    }

    public boolean canRegenerateTail() {
        return canRegenerateTail;
    }

    public void setCanRegenerateTail(boolean canRegenerateTail) {
        this.canRegenerateTail = canRegenerateTail;
    }


    public String toString() {
        return super.toString() + ", Venomous: " + isVenomous + ", Can Regenerate Tail: " + canRegenerateTail;
    }
}
