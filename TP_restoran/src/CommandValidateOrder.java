public class CommandValidateOrder implements Command {
    private Manager manager;
    private Order order;

    public CommandValidateOrder(Manager manager, Order order) {
        this.manager = manager;
        this.order = order;
    }

    @Override
    public void execute() {
        double total = manager.validateOrder(order);
        System.out.println("Общая стоимость заказа: " + total);
    }
}
