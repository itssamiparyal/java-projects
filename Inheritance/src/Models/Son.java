package Models;

public class Son extends Parent{
    public String name;

    public Son(String caste, String house, int bankBalance, String name) {
        super(caste, house, bankBalance);
        this.name = name;
    }
}
