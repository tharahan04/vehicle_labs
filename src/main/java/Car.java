import interfaces.IAirplane;
import interfaces.ICar;

public class Car extends Vehicle implements ICar {

    public Car(String name, String fuelType, String travelType, boolean publicTravel, int noOfWheels, int maxOfOccupants) {
        super(name, fuelType, travelType, publicTravel, noOfWheels, maxOfOccupants);

    }

    // Abstract Method
    @Override
    public String engineNoise() {
        return "Vrooooom!";
    }

    // Interface method - the maxspeed for each class
    public String car(int maxSpeed) {
        return this.name + " has a maximum speed of " + maxSpeed + "mph";

    }
}