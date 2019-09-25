import java.util.ArrayList;

public class Room {

    private int roomNumber;
    private String roomName;
    private int capacity;
    private String roomType;
    private Boolean occupied;
    private double nightlyRate;
    private ArrayList<Guest> guests;

    public Room(int roomNumber, String roomName, int capacity, String roomType, boolean occupied, int nightlyRate) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.capacity = capacity;
        this.roomType = roomType;
        this.occupied = occupied;
        this.nightlyRate = nightlyRate;
        this.guests = new ArrayList<Guest>();
    }


    public void addGuest(Guest guest) {
        this.guests.add(guest);
        this.occupied = true;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
        this.occupied = false;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public Boolean getOccupied(){
        return occupied;
    }
}
