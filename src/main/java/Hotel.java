import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> emptyRooms;
    private ArrayList<Booking> bookedRooms;
    private ArrayList<Room> occupiedRooms;

    public Hotel(String name){
        this.name = name;
        this.emptyRooms = new ArrayList<Room>();
        this.bookedRooms = new ArrayList<Booking>();
        this.occupiedRooms = new ArrayList<Room>();
    }

    public void addEmptyRoom(Room room) {

        if (!room.getOccupied()){
            this.emptyRooms.add(room);
        }
    }

    public int countEmptyRooms() {
        return this.emptyRooms.size();
    }

    public void removeEmptyRoom(Room room) {
        this.emptyRooms.remove(room);
    }

    public void addBookedRoom(Booking booking) {
        this.bookedRooms.add(booking);
    }

    public int countBookedRooms() {
        return this.bookedRooms.size();
    }

    public void removeBookedRoom(Booking booking) {
        this.bookedRooms.remove(booking);
    }

    public void bookRoom(Room room, Booking booking){
        //removes an room from emptyRoom
        removeEmptyRoom(room);
        //adds booking to bookedRooms
        addBookedRoom(booking);
        //return cost of booking

    }

    public double calculateTotalCost(Room room, Booking booking){
        return room.getNightlyRate() * booking.getNights();
    }

    public void checkIn(Room room, Booking booking){
        removeBookedRoom(booking);
        addCheckedIn(room);
    }

    private void addCheckedIn(Room room) {
        if(!room.getOccupied()){
            this.occupiedRooms.add(room);
        }
    }

    public int countOccupiedRooms() {
        return this.occupiedRooms.size();
    }
}
