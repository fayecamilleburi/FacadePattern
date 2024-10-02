public class HotelApp {
    public static void main(String[] args) {
        Valet valet = new Valet("NBS 4842");
        HouseKeeping houseKeeping = new HouseKeeping(501);
        Cart cart = new Cart(3);

        FrontDesk facade = new FrontDesk(valet, houseKeeping, cart);

        System.out.println(facade.availValet());
        System.out.println(facade.availHouseKeeping());
        System.out.println(facade.availCart());
    }
}