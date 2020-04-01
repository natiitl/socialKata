package socialKata;

import java.util.ArrayList;
import java.util.List;

public class Users {
    List<User> userList = new ArrayList<>();
    Console console;

    public Users(Console console) {
        this.console = console;
    }

    public void addUser(User user) {
        userList.add(user);
    }


    public User userExist(String nameUser, Posts posts) {
        for (User userIndex : userList) {
            if (userIndex.equals(nameUser)) {
                return userIndex;
            }
        }
        User user = new User(nameUser, console);
        userList.add(user);
        return user;
    }
}
