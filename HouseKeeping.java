public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String availService() {
        return "You have availed a room. Your room number is " + roomNumber + ".";
    }
}