package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean isFound = false;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                isFound = true;
                return users[index];
            }
        }
        if (!isFound) {
            throw new UserNotFoundException("User not found!");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean isValid = false;
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User name is not valid!");
        } else {
            isValid = true;
        }
        return isValid;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException inv) {
            System.out.println("User name is not valid!");
            inv.printStackTrace();
        } catch (UserNotFoundException unfe) {
            System.out.println("User name not found!");
            unfe.printStackTrace();
        }
    }
}
