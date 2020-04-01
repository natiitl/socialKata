package socialKata;

public class SocialRed {

    private static final String POSTING = "->";
    private static final String FOLLOW = "follow";
    private Console console;
    private Users users;
    private Friends friends;
    private Post post;
    private Posts posts;


    public SocialRed(Console console, Users users, Friends friends, Post post, Posts posts) {

        this.console = console;
        this.users = users;
        this.friends = friends;
        this.post = post;
        this.posts = posts;
    }

    public void command(String command) {

        String[] splitCommand = splitCommandAndUser(command);
        String nameUser = splitCommand[0];
        String postMessenger = splitCommand[1];

        User user = users.userExist(nameUser, posts);

        user.posting(new Post(postMessenger));


    }

    public String[] splitCommandAndUser(String command) {
        String nameUser = null;
        String postMessenger = null;
        if (command.contains(POSTING)) {
            nameUser = command.substring(0, command.indexOf(POSTING));
            postMessenger = command.substring(command.indexOf(POSTING) + 3, command.length());
        }
        if (command.contains(FOLLOW)) {
            nameUser = command.substring(0, command.indexOf(FOLLOW));
            postMessenger = command.substring(command.indexOf(FOLLOW) + 3, command.length());
        }

        String[] arrayCommandUser = {nameUser, postMessenger};

        return arrayCommandUser;
    }
}
