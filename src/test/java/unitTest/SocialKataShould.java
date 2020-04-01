package unitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import socialKata.*;

import static org.mockito.Mockito.*;

public class SocialKataShould {
    Console console;
    SocialRed socialRed;
    User user;
    Users users;
    Friends friends;
    Post post;
    Posts posts;



    @BeforeEach
    public void testInit() {
        console = mock(Console.class);
        friends = new Friends();
        post = new Post();
        posts = new Posts(console);
        users = new Users(console);
        socialRed = new SocialRed(console,users,friends,post,posts);

    }

    @Test
    public void verify_nat_post() {
        socialRed.command("Nat -> Hallo!");
        socialRed.command("Nat");

        verify(console).printWall("Hallo!");
    }
    @Test
    public void verify_nat_follow_miri_and_nat_wall() {
        socialRed.command("Nat follow Miri");//No debería salir verde
        socialRed.command("Miri -> Hallo!");
        socialRed.command("Nat wall");

        verify(console).printWall("Hallo!");
    }
}

