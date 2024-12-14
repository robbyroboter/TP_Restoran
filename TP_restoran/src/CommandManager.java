import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

//Раньше это был Invoker

public class CommandManager {
    private Queue<Command> commands = new LinkedList<>();
    private Employee firstEmployee;

    public CommandManager(Employee firstEmployee) {
        this.firstEmployee = firstEmployee;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        while (!commands.isEmpty()) {
            Command command = commands.poll();
            firstEmployee.performTask(command);
        }
    }


//    private final List<Command> deliveryCommands = new ArrayList<>();
//
//    // Добавление команды
//    public void addCommand(Command command) {
//        deliveryCommands.add(command);
//    }
//
//    // Выполнение всех команд
//    public void executeCommands() {
//        for (Command command : deliveryCommands) {
//            command.execute();
//        }
//        deliveryCommands.clear(); // Очищаем список после выполнения
//    }
}
