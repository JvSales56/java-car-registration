public class Car {

    private String name;
    private double price;

    private static int totalCars = 0;
    private static double totalPrice = 0;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;

        totalCars++;
        totalPrice += price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }
}