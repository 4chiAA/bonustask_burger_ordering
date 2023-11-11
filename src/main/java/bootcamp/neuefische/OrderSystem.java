package bootcamp.neuefische;

import java.util.HashMap;
import java.util.Map;

public class OrderSystem {

    // Naming:
    // Key = 101,102,103,104,105,... for Beef Menu 1,2,3,4,5
    // 201,202,203, ... for Chicken Menu 1,2,3
    // 301,302,303, ... for Veggie Menu 1,2,3
    // 401,402,403, ... for Vegan Menu 1,2,3
    public static Map<String, Menu> menus = new HashMap<>();

    public static void addMenu(String number, Menu menu) {
        menus.put(number, menu);
    }
}
