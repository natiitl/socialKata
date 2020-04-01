package socialKata;

public class Post {
    String postString;

    public Post(String postString) {
        this.postString = postString;
    }

    public Post() {

    }

    public void printPost(Console console) {
        console.printWall(postString);
    }
}
