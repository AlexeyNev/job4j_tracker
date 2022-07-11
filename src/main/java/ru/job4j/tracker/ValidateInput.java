package ru.job4j.tracker;

/**
 *     Если нужно выбрать - как организовать проверку с помощью if() или использовать блок catch с исключением
 *  * - то выбирать стоит второе. Поскольку такой вариант работает быстрее
 *  * и нам не требуется писать код для дополнительной проверки
 */
public class ValidateInput implements Input {
    private final Output out;
    private final Input in;
    private ValidateInput input;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException rsl) {
                System.out.println("Please enter validate data again ");
            }
        } while (invalid);
        return value;
    }
}