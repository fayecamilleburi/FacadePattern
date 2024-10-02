public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String availService() {
        return "Valet will pick up your car with the plate number " + plateNumber + ".";
    }
}