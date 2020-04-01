package socialKata;

import java.util.ArrayList;
import java.util.List;

public class Posts {
    List<Post> listPosts = new ArrayList<>();
    private Console console;

    public Posts(Console console) {
        this.console = console;
    }

    public void addPost(Post post) {
        listPosts.add(post);
        printPosts();

    }
    public void printPosts() {
        for (Post post : listPosts) {
            post.printPost(console);
        }
    }
}
