import interfaces.IHelicopter;

public class Helicopter extends AirTransport implements IHelicopter {
    public Helicopter(String name,String fuelType,String travelType,boolean publicTravel, int noOfWheels,int maxOfOccupants){
        super(name,fuelType,travelType,publicTravel,noOfWheels,maxOfOccupants);

    }
    // Abstract Method
    @Override
    public String engineNoise(){
        return "buh buh buh buh !";
    }

    // Interface method - the maxspeed for each class

    public String helicopter (int maxSpeed){
        return this.name + " has a maximum speed of " + maxSpeed+ "mph";
    }

    // OverLoad Method:

    public void takeOff() {
        System.out.println("Helicopter takes off.");
    }
    public void takeOff(int runWayLength) {
        System.out.println(this.getName() + " takes off using 2 engines with a runway length of " + runWayLength +"m.");

    }


}