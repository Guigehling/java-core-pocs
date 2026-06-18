package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {

    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeAll() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
