import java.util.ArrayList;

public class Booking {
    private int numberOfNights;
    private ArrayList<Room> bookedRooms;
    private Room room;

    public Booking(int numberOfNights) {
        this.numberOfNights = numberOfNights;
        this.bookedRooms = new ArrayList<Room>();
    }

    public int getNights() {
        return numberOfNights;
    }

    public void addRoomsToBooking(Room room){
        this.bookedRooms.add(room);
    }

    public int bookedRoomsAdded() {
        return this.bookedRooms.size();
    }
}
