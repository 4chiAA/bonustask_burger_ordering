package bootcamp.neuefische;

public class Menu {

    private String name;
    private int price;
    private String mainDish;
    private String sideDish;
    private String beverage;

    public Menu(){

    }


    public Menu(String name, int price, String mainDish, String sideDish, String beverage) {
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }


}
