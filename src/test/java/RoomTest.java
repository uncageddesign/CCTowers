import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void setUp(){
        room = new Room(123, "Double Room", 2,"Double", false, 60);
        guest = new Guest("Bob");
    }

    @Test
    public void canAddGuest(){
        //Given we have a room
        assertNotNull(room);
        //And a guest to check in
        assertNotNull(guest);
        //When we add guest to room
        room.addGuest(guest);
        //Then guest count should equal 1
        assertEquals(1, room.guestCount());
        //And occupied changes to true
        assertEquals(true, room.isOccupied());
    }

    @Test
    public void canRemoveTest(){
        // Given we have a room
        assertNotNull(room);
        // AND it has a guest in it
        room.addGuest(guest);
        // When we remove guest from room
        room.removeGuest(guest);
        // Then guest count should equal 0
        assertEquals(0, room.guestCount());
        // And occupied changes to false
        assertEquals(false, room.isOccupied());
    }
}
