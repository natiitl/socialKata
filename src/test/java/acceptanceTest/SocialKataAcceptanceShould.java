package acceptanceTest;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InOrder;
import socialKata.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class SocialKataAcceptanceShould {
    Console console;
    SocialRed socialRed;
    Users users;
    Post post;
    Posts posts;
    Friends friends;
    InOrder inOrder;

    @BeforeEach
    public void init() {
        console = mock(Console.class);
        post = mock(Post.class);
        posts = mock(Posts.class);
        socialRed = new SocialRed(console,users,friends,post,posts);
        inOrder = inOrder(console);

    }

    @Test
    public void check_reading_nats_post() {
        socialRed.command("Nat -> Hallo!");
        socialRed.command("Nat");

        verify(console).printWall("Hallo!");
    }


    @Test
    public void check_wall() {
        socialRed.command("Nat -> Hallo!");
        socialRed.command("Nat");
        socialRed.command("Nat follows Miri");
        socialRed.command("Miri -> Hallo Nat!");
        socialRed.command("Wall");

        inOrder.verify(console).printWall("Hallo!");
        inOrder.verify(console).printWall("Miri - Hallo Nat!");
        inOrder.verify(console).printWall("Nat - Hallo!");

    }
}
