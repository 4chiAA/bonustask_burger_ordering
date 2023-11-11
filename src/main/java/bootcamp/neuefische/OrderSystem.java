package bootcamp.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {

    // Naming:
    // Key = 101,102,103,104,105,... for Beef Menu 1,2,3,4,5
    // 201,202,203, ... for Chicken Menu 1,2,3
    // 301,302,303, ... for Veggie Menu 1,2,3
    // 401,402,403, ... for Vegan Menu 1,2,3
    public static Map<String, Menu> menus = new HashMap<>();
    public static Map<String, Menu> order = new HashMap<>();

    public static void addMenu(String Id, Menu menu) {
        menus.put(Id, menu);
    }

    public static Menu getOrderById(String id) {
        return menus.get(id);
    }

    public static void placeOder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Nummer ihres gewünschten Menüs ein:");
        String id = sc.next();
        System.out.println(OrderSystem.getOrderById(id));
        System.out.println("Möchten Sie dieses Menü Ihrer Bestellung hinzufügen?");
        System.out.println("Für ja drücken Sie bitte y, für nein drücken sie Bitte n");
        String enter = sc.next();
        if("y".equals(enter)){
            OrderSystem.order.put(id, getOrderById(id));
            System.out.println("Ihre Bestellung beinhaltet folgende Artikel:");
            System.out.println("main dish: " + OrderSystem.order.get(id).getMainDish() +
                    ", side dish: " + OrderSystem.order.get(id).getSideDish() + ", beverage: " +
                    OrderSystem.order.get(id).getBeverage());
            System.out.println("Der Preis liegt bei " + OrderSystem.order.get(id).getPrice() + "€.");
        } else if ("n".equals(enter)){
            System.out.println("Sie haben nichts bestellt.");
        }
    }
}
