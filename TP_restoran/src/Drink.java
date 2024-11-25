import java.util.ArrayList;
import java.util.List;

public class Drink {
    private String name;
    private String type;
    private double price;
    private List<DrinkDecorator> items;

    public Drink(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.items = new ArrayList<>();
    }

    public double getCost() {
        double totalCost = price;
        for (DrinkDecorator item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public void addOption(DrinkDecorator option) {
        items.add(option);
    }
}
