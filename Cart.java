public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public String availService() {
        return "You have requested " + numberOfCarts + " carts.";
    }
}