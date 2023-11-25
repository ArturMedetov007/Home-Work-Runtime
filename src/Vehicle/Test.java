package Vehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.make = "make 200km/h";
        c1.Model = " Mersedec ";
        c1.Year = 2023;
        c1.numDoors = 4;
        c1.displayInfo();
        Motorcycle m1 = new Motorcycle();
        m1.make = "make 250km/h";
        m1.Model = " Yokohama ";
        m1.Year = 2020;
        m1.displayInfo();
    }

}
