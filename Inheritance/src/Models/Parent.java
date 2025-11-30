package Models;

public class Parent extends Gparents {
    public String house;
    int bankBalance;

    public Parent(String caste, String house, int bankBalance) {
        super(caste);
        this.house = house;
        this.bankBalance = bankBalance;
    }
}
