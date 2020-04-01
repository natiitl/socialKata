package socialKata;

import java.util.ArrayList;
import java.util.List;

public class Friends {
    List<User> listFriends = new ArrayList<>();

    public void addFriend(User friend) {
        listFriends.add(friend);
    }
}
