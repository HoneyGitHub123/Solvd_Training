package homework.airport;

import homework.airport1.AirportManagement;

//Created and override at least one abstract method from parent class
//used static final variables and method
//created final class
public final class AirLine extends AirportManagement {
    //static final variables
    public static final String airline = "Qatar Airlines";
    public static final int capacity = 300;

    AirLine() {
        super("LAX Airport");

    }

    //Abstract method implementation in child class
    @Override
    public void getAirportDetails(String airportId, String airportName,
                                  String airportLocation) {
        System.out.println("Airport ID:" + airportId);
        System.out.println("Airport Name:" + airportName);
        System.out.println("Airport Location:" + airportLocation);

    }

    //Method Overloading
    public void getAirportDetails() {
        System.out.println("*****************");
    }

    //Static final method
    public static final void getAirlineDetails() {
        System.out.println("Airline Details");
        System.out.println("================");
        System.out.println(airline);
        System.out.println("Maximum Capacity:" + capacity);

    }
}

