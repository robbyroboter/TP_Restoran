public class Chef extends Employee {
    public Chef(String name, int experience) {
        super(name, "Chef", experience);
    }

    @Override
    protected boolean canHandleTask(Command task) {
        return task instanceof CommandPrepareDish;
    }

    public void prepareDish(Dish dish) {
        System.out.println(name + " готовит блюдо: " + dish.getName());
    }

//    @Override
//    public void performTask(String task) {
//        if (task.equalsIgnoreCase("готовь")) {
//            System.out.println(name + " (Chef) готовит.");
//        } else {
//            System.out.println(name + " (Chef) не может выполнить поручение \"" + task + "\", передаёт его другому сотруднику.");
//            super.performTask(task);
//        }
//    }
}
