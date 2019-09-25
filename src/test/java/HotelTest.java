import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HotelTest {

    Hotel hotel;
    Room room;
    Booking booking;

    @Before
    public void setUp(){
        hotel = new Hotel("Hotel California");
        booking = new Booking(3);
        room = new Room(123, "Double Room", 2,"Double", false, 60);
    }


    @Test
    public void canAddEmptyRoomToHotel(){
        // Given we have a hotel
        assertNotNull(hotel);
        // AND we have a room
        assertNotNull(room);
        // When we add a room to empty rooms
        hotel.addEmptyRoom(room);
        // Then empty room count is one
        assertEquals(1, hotel.countEmptyRooms());
    }

    @Test
    public void canRemoveEmptyRoomFromHotel(){
        // Given we have a hotel
        assertNotNull(hotel);
        // AND it has an empty room
        hotel.addEmptyRoom(room);
        // When we remove room from empty rooms
        hotel.removeEmptyRoom(room);
        // Then the empty room count is zero
        assertEquals(0, hotel.countEmptyRooms());
    }

    @Test
    public void canAddBookedRoomToHotel(){
        // Given we have a hotel
        assertNotNull(hotel);
        // And a room is booked
        assertNotNull(room);
        // When we add room to booked rooms
        hotel.addBookedRoom(booking);
        // Then the booked room count is 1
        assertEquals(1, hotel.countBookedRooms());
    }

    @Test
    public void canRemoveBookedRoomFromHotel(){
        // Given we have a hotel
        assertNotNull(hotel);
        // And it has a booked room
        hotel.addBookedRoom(booking);
        // When we remove room from booked rooms
        hotel.removeBookedRoom(booking);
        // Then the booked room count is zero
        assertEquals(0, hotel.countBookedRooms());
    }

    @Test
    public void canRemoveEmptyRoomAndAddBooking(){
        //Given we have an empty room
        hotel.addEmptyRoom(room);
        //When a booking has been made
        hotel.bookRoom(room, booking);
        //Then emptyRooms count should be zero
        assertEquals(0, hotel.countEmptyRooms());
        //AND bookedRooms count should be one
        assertEquals(1, hotel.countBookedRooms());
    }

    @Test public void canCalculateCostOfBooking(){
        // Given we have a booking
        assertNotNull(booking);
        // When booking made
        hotel.bookRoom(room, booking);
        // Then we should calculate total cost of booking
        assertEquals(180, hotel.calculateTotalCost(room, booking), 0.01);
    }

    @Test
    public void canCheckIn(){
        //Given we have a booking
        assertNotNull(booking);
        //When a guest checks in
        hotel.checkIn(room, booking);
        //Then the occupiedRooms count is 1
        assertEquals(1, hotel.countOccupiedRooms());
    }

}
