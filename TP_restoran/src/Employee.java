public abstract class Employee {
    protected String name;
    protected String role;
    protected int experience;
    protected Employee nextEmployee; // Ссылка на следующего сотрудника в цепочке

    public Employee(String name, String role, int experience) {
        this.name = name;
        this.role = role;
        this.experience = experience;
    }

    public void setNextEmployee(Employee next) {
        this.nextEmployee = next;
    }

    public void performTask(String task) {
        if (nextEmployee != null) {
            nextEmployee.performTask(task);
        } else {
            System.out.println("Поручение \"" + task + "\" не может быть выполнено никем в цепочке.");
        }
    }
}
