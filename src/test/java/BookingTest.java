import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookingTest {
    Booking booking;
    Hotel hotel;
    Room room;

    @Before
    public void setUp(){
        booking = new Booking( 3);
        hotel = new Hotel("Hotel California");
        room = new Room(123, "Double Room", 2,"Double", false, 60);
    }


    @Test
    public void roomIsOccupiedForANumberOfNights(){
        // Given we have a booking
        assertNotNull(booking);
        // When the room is booked for a period of nights
        // Then the number of nights is less than 0
        assertEquals(3, booking.getNights());
    }

    @Test
    public void canAddRoomToBookedRooms(){
        // Given we have a booking
        assertNotNull(booking);
        // AND we have a room
        assertNotNull(room);
        // When the room is booked
        booking.addRoomsToBooking(room);
        // Then the number of rooms in booked rooms should be 1
        assertEquals(1, booking.bookedRoomsAdded());
    }
}
