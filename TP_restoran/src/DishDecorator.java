public class DishDecorator {
    private String description;
    private double cost;

    public DishDecorator(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
