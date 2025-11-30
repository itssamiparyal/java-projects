package Models;


public class Enclosure {
    private double size;
    private String habitatType;
    private int capacity;

    public Enclosure(double size, String habitatType, int capacity) {
        this.size = size;
        this.habitatType = habitatType;
        this.capacity = capacity;
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String toString() {
        return "Enclosure{" +
                "size=" + size +
                ", habitatType='" + habitatType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
