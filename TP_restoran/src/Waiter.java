public class Waiter extends Employee {
    public Waiter(String name, int experience) {
        super(name, "Waiter", experience);
    }

    public void confirmOrder(Order order) {
        System.out.println("\nЗаказ создан:");
        System.out.println("Официант: " + name);
        System.out.println("Позиции:");
        for (Dish dish : order.getDishes()) {
            System.out.println("- " + dish.getName() + " ($" + dish.getCost() + ")");
        }
        for (Drink drink : order.getDrinks()) {
            System.out.println("- " + drink.getName() + " ($" + drink.getCost() + ")");
        }
    }

    @Override
    protected boolean canHandleTask(Command task) {
        return task instanceof CommandConfirmOrder;
    }

    public void serveDish(Dish dish) {
        System.out.println(name + " подаёт блюдо: " + dish.getName());
    }

//    @Override
//    public void performTask(String task) {
//        if (task.equalsIgnoreCase("бери заказ")) {
//            System.out.println(name + " (Waiter) берёт заказ.");
//        } else {
//            System.out.println(name + " (Waiter) не может выполнить поручение \"" + task + "\", передаёт его другому сотруднику.");
//            super.performTask(task);
//        }
//    }
}
