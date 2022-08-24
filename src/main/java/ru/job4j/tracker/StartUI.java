package ru.job4j.tracker;

import java.util.List;

/**
 * метод init содержит блок if. Мы все блоки вынесли в методы, разибили код на функциональные блоки
 * Это позволит легко читать аккуратный код и без проблем вносить правки
 * public void init(Input input, Tracker tracker, UserAction[] actions) {
 * boolean run = true;
 * while (run) {
 * this.showMenu(actions);
 * int select = input.askInt("Select: ");
 * UserAction action = actions[select];
 * run = action.execute(input, tracker);
 * }
 * }
 */

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");

            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ShowAllAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindItemByIdAction(output),
                new FindItemByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, List.of(actions));
    }
}

