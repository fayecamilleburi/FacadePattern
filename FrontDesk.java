public class FrontDesk {
    private HotelService valet;
    private HotelService houseKeeping;
    private HotelService cart;

    public FrontDesk(HotelService valet, HotelService houseKeeping, HotelService cart) {
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public String availValet() {
        return valet.availService();
    }

    public String availHouseKeeping() {
        return houseKeeping.availService();
    }

    public String availCart() {
        return cart.availService();
    }
}