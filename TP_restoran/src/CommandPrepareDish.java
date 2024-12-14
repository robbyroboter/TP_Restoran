public class CommandPrepareDish implements Command {
    private Chef chef;
    private Order order;

    public CommandPrepareDish(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        for (Dish dish : order.getDishes()) {
            System.out.println("- " + dish.getName());
            chef.prepareDish(dish);
        }
    }
}
