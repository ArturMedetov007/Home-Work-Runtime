package Vehicle;

public class Vehicle {
    String make;
    String Model;
    int Year;
    int numDoors;
    public void displayInfo(){
        System.out.println(make + Model + Year + " число дверей " + numDoors);
    }
}
