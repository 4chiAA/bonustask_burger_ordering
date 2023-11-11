package bootcamp.neuefische;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderSystemTest {

    @Test
    void addMenu_whenAdding1Element_thenSizeIs1(){
        // GIVEN
        int expected = 1;
        // WHEN
        Menu menu = new Menu("Beef Burger Menu", 17, "Double Trouble", "Homestyle Fries", "Fanta");
        OrderSystem.addMenu("101", menu);
        int actual = OrderSystem.menus.size();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void addMenu_whenAddingMenu101_thenEqualsMenu101(){
        // GIVEN
        Map<String, Menu> expected = new HashMap<>();
        Menu menu = new Menu("Beef Burger Menu", 17, "Double Trouble", "Homestyle Fries", "Fanta");
        expected.put("101", menu);
        // WHEN
        OrderSystem.addMenu("101", menu);
        Map<String, Menu> actual = OrderSystem.menus;
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void getOrderById_whenMenuIdIs101_getMenuValueOfId101(){
        // GIVEN
        Menu expected = new Menu("Beef Burger Menu", 17, "Double Trouble", "Homestyle Fries", "Fanta");
        // WHEN
        OrderSystem.addMenu("101", expected);
        Menu actual = OrderSystem.getOrderById("101");
        // THEN
        assertEquals(expected, actual);
    }


    // GIVEN
    // WHEN
    // THEN

}