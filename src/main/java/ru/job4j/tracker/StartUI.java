package ru.job4j.tracker;

/**
 * метод init содержит блок if. Мы все блоки вынесли в методы, разибили код на функциональные блоки
 * Это позволит легко читать аккуратный код и без проблем вносить правки
 */
public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new DeleteAction(),
                new ShowAllAction(),
                new EditItem(),
                new FindItemById(),
                new FindItemByName(),
                new Exit()
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
