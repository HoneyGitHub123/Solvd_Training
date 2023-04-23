package homework.airport;

import homework.airport1.AirportManagement;

//class with main() which will instantiate objects of implemented classes
//Used polymorphism with the abstract class and interface from the hierarchy
//Static block used
public class Main {
    //Example for static block
    static {

        System.out.println("Implementation of Airport System");
    }

    public static void main(String[] args) {

        AirportManagement am = new AirLine();
        //This is an example for dynamic binding
        am.getAirportDetails("LAX124", "Los Angeles International Airport",
                "California");
        AirLine al = new AirLine();
        //This is an example for static binding
        al.getAirportDetails();
        AirLine.getAirlineDetails();
        //Calling static final method from main class without object
        TicketReservation tr = new TicketReservation();
        tr.getCustomerDetails("John Math", "156 N street", "PN8787", 999999999);
        tr.getFlightDetails();
        tr.bookSeat("A12", "Economy");
        tr.getPayment("5574656546", "USD", 1500);

        Passenger psg = new Passenger("John Math", 100012,
                "QTR9898", "A12",
                "Economy");
        Passenger psg1 = new Passenger("John Math", 100012,
                "QTR9898", "A12",
                "Economy");
        psg.getPassengerDetails();
        System.out.println(psg);
        System.out.println("Comparing two passenger objects psg,psg1:True or False?" + psg.equals(psg1));
        System.out.println(psg.hashCode());
        System.out.println(psg1.hashCode());

        Flight fgt = new Flight("QTR01", "LAX", "DOH", "Apr 20,3:00PM",
                "Apr 21,10:00PM");
        BoardingPass bps = new BoardingPass(psg, fgt);
        bps.getPassengerDetails();
        bps.getFlightDetails();
        bps.setGate("A10");
        System.out.print("Gate:" + bps.getGate());
        bps.setTerminal(7);
        System.out.println("\t\t\t\t\tTerminal:" + bps.getTerminal());
        Luggage lug = new Luggage();
        lug.setLuggageId("LG1009");
        System.out.println("*************************");
        System.out.println("Luggage ID:" + lug.getLuggageId());
        lug.setLuggageCount(2);
        System.out.println("Luggage Count:" + lug.getLuggageCount());
        AirEmployees ae = new AirEmployees("Maria", "1456",
                "Cabin Crew",
                "Associate");
        ae.getEmployeeDetails();
        System.out.println(ae);
        double sal = ae.calculateSalary(30, 40);
        System.out.println("Weekly salary of the employee in USD:" + sal);

        AirEmployees ae1 = new AirEmployees("Anna", "1980",
                "Cabin Crew",
                "Senior");
        System.out.println(ae1);
        double sal1 = ae.calculateSalary(50, 40);
        System.out.println("Weekly salary of the employee in USD:" + sal1);

        System.out.println("Comparing two Air Employees objects ae & ae1:True or False?" + ae1.equals(ae));
        System.out.println(ae.hashCode());
        System.out.println(ae1.hashCode());
        GroundEmployees ge = new GroundEmployees("John", "7856",
                "Enquiry Department",
                "Associate");
        GroundEmployees ge1 = new GroundEmployees("John", "7856",
                "Enquiry Department",
                "Associate");
        ge.getEmployeeDetails();
        System.out.println(ge);
        System.out.println(ge1);
        System.out.println("Comparing two Ground Employees objects ae & ae1:True or False?" + ge.equals(ge1));
        System.out.println(ge.hashCode());
        System.out.println(ge1.hashCode());

    }

}


