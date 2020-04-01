package socialKata;

import java.util.Objects;

public class User {
    String nameUser;
    Post post;
    Console console;
    Posts posts;
    Friends friends;

    public User(String nameUser, Console console) {

        this.nameUser = nameUser;
        this.console = console;
        this.posts = new Posts(console);
        this.friends = new Friends();
    }

    public void posting(Post post) {
        posts.addPost(post);

    }

    public void addFriend(User user) {
        friends.addFriend(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nameUser, user.nameUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameUser);
    }


}
