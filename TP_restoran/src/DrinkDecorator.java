public class DrinkDecorator {
    private String description;
    private double cost;

    public DrinkDecorator(String description, double cost) {
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
