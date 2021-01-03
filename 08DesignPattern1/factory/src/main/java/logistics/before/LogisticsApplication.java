package logistics.before;

public class LogisticsApplication {

    public static void main(String[] args) {
        processGoods("Smartphone", "HN");
    }

    private static void processGoods(String goods, String location) {
        System.out.println(String.format("Packing %s", goods));
        if (location.equals("HCM")) {
            Train train = new Train();
            train.deliver(goods, location);
        } else if (location.equals("Foreign")) {
            Ship ship = new Ship();
            ship.deliver(goods, location);
        } else {
            Truck truck = new Truck();
            truck.deliver(goods, location);
        }
        System.out.println(String.format("Unpacking %s", goods));
    }
}
