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

    @Override
    public String toString() {
        return  name + '\'' +
                ", price=" + price +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getBeverage() {
        return beverage;
    }
}
