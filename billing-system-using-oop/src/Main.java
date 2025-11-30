import Models.Order;
import Models.Category;
import Models.Food;
import Models.Food_Order;

public class Main {
    public static void main(String[] args) {

        Category foodCategory = new Category("Food", 10);
        Category drinksCategory = new Category("Drinks", 5);

        Food pizza = new Food("Pizza", foodCategory, 1000);
        Food burger = new Food("Burger", foodCategory, 800);
        Food coke = new Food("Coke", drinksCategory, 300);

        Food_Order First = new Food_Order(1, pizza, 2);
        Food_Order Second = new Food_Order(2, burger, 1);
        Food_Order Third = new Food_Order(3, coke, 3);

        Order order1 = new Order(1);
        order1.addFoodOrder(new Food_Order(1, pizza, 2));
        order1.addFoodOrder(new Food_Order(2, burger, 1));
        order1.addFoodOrder(new Food_Order(3, coke, 3));

        order1.printBill();
    }
}