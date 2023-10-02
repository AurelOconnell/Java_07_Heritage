public class Hangar {
    
    public static void main(String[] args) {
        Car car = new Car("Peugeot", 50000);
        Boat boat = new Boat("Costa Concordia", 100000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
