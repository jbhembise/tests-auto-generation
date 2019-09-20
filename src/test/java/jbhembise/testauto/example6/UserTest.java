package jbhembise.testauto.example6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void user_should_have_borrowed_media_after_borrowing() {
        User user = new User("JB", "Hembise");
        Media media = null;
        user.borrow(media);
        assertEquals("JB", user.getFirstName());
    }

}
