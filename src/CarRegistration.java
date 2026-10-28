import java.util.Scanner;

public class CarRegistration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Car[] cars = new Car[50];

        System.out.print("How many cars for registration ?");
        int quantity = input.nextInt();
        input.nextLine();

        if (quantity < 1 || quantity > 50) {
            System.out.println("Invalid input!");
            input.close();
            return;
        }

        for (int i = 0; i < quantity; i++) {
            System.out.printf("\nCar Registration %d\n", i + 1);

            System.out.print("Enter the model: ");
            String name = input.nextLine();

            System.out.print("Price of the car: R$ ");
            double price = input.nextDouble();
            input.nextLine();

            cars[i] = new Car(name, price);
        }

        System.out.println("\n=== Registration Summary ===");

        for (int i = 0; i < quantity; i++) {
            System.out.println("Car: " + cars[i].getName());
        }

        System.out.println(
                "Total cars registered: " + Car.getTotalCars()
        );

        System.out.printf(
                "Total price: R$ %.2f\n",
                Car.getTotalPrice()
        );

        input.close();
    }
}