package bootcamp.neuefische;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Menu menu1 = new Menu("Beef Burger Menu1", 17, "Double Trouble", "Homestyle Fries", "Fanta");
        Menu menu2 = new Menu("Beef Burger Menu2", 19, "BBQ Banger", "Homestyle Fries", "Cola");
        Menu menu3 = new Menu("Veggie Burger Menu1", 15, "Mr. Green", "Country Potatoes", "Cola");
        Menu menu4 = new Menu("Vegan Burger Menu1", 16, "Miss Sunshine", "Inion Rings", "Water");

        OrderSystem.addMenu("101", menu1);
        OrderSystem.addMenu("102", menu2);
        OrderSystem.addMenu("201", menu3);
        OrderSystem.addMenu("301", menu4);

        System.out.println(OrderSystem.menus);
        System.out.println(OrderSystem.getOrderById("301"));

        OrderSystem.placeOder();
    }
}