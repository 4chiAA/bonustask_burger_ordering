package bootcamp.neuefische;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderSystemTest {

    @Test
    void addMenu_whenAdd1Element_thenSizeIs1(){
        // GIVEN
        Menu menu = new Menu("Beef Burger Menu", 17, "Double Trouble", "Homestyle Fries", "Fanta");
        int expected = 1;
        // WHEN
        OrderSystem.addMenu("101", menu);
        int actual = OrderSystem.menus.size();
        // THEN
        assertEquals(expected, actual);
    }


    // GIVEN
    // WHEN
    // THEN

}