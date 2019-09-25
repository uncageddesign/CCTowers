import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp(){
       guest = new Guest("Bob");
    }

    @Test
    public void guestHasName(){
        assertEquals("Bob", guest.getName());
    }
}
