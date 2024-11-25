public class Manager extends Employee {
    public Manager(String name, int experience) {
        super(name, "Manager", experience);
    }

    public double validateOrder(Order order) {
        double total = 0.0;

        // Суммируем стоимость всех блюд
        for (Dish dish : order.getDishes()) {
            total += dish.getCost();
        }

        // Суммируем стоимость всех напитков
        for (Drink drink : order.getDrinks()) {
            total += drink.getCost();
        }

        return total;
    }

    @Override
    public void performTask(String task) {
        if (task.equalsIgnoreCase("проверь заказ")) {
            System.out.println(name + " (Manager) проверяет заказ.");
        } else {
            System.out.println(name + " (Manager) не может выполнить поручение \"" + task + "\", передаёт его другому сотруднику.");
            super.performTask(task);
        }
    }
}
