public class Chef extends Employee {
    public Chef(String name, int experience) {
        super(name, "Chef", experience);
    }

    @Override
    public void performTask(String task) {
        if (task.equalsIgnoreCase("готовь")) {
            System.out.println(name + " (Chef) готовит.");
        } else {
            System.out.println(name + " (Chef) не может выполнить поручение \"" + task + "\", передаёт его другому сотруднику.");
            super.performTask(task);
        }
    }
}
