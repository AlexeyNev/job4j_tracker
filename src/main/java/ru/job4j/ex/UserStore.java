package ru.job4j.ex;

public class UserStore {

    /**
     * Поиск пользоватея в списке
     *
     * @throws UserNotFoundException
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("not found");
    }

    /**
     * Проверка на валидность пользователя
     *
     * @throws UserInvalidException
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("isn't valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Fedor Petrov", false)
        };
        User user;
        try {
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException n) {
            n.printStackTrace();
        } catch (UserNotFoundException u) {
            u.printStackTrace();
        }
    }
}
