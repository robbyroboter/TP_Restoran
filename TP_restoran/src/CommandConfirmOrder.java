public class CommandConfirmOrder implements Command {
    private Waiter waiter;
    private Order order;

    public CommandConfirmOrder(Waiter waiter, Order order) {
        this.waiter = waiter;
        this.order = order;
    }

    @Override
    public void execute() {
        waiter.confirmOrder(order);
    }
}
