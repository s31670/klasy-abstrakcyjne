public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "GTR", 2020, 800, 20);
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles per gallon");

        Truck truck = new Truck("BMW", "X5M", 2019, 800, 50, 10);
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " miles per gallon");
    }
}
