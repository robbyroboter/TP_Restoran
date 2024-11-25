import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private String type;
    private double price;
    private List<DishDecorator> items;

    public Dish(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.items = new ArrayList<>();
    }

    public double getCost() {
        double totalCost = price;
        for (DishDecorator item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public void addOption(DishDecorator option) {
        items.add(option);
    }
}
