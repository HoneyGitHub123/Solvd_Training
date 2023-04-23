package homework.airport;
//Add 2 interfaces to the existing hierarchy

public class TicketReservation extends Flight implements Customer, Payment {
    TicketReservation() {
        super("QTR01", "LAX", "DOH", "Apr 20,3:00PM", "Apr 21,10:00PM");
    }

    @Override
    public void getCustomerDetails(String name, String address, String passportNum, long phoneNum) {
        //calling static final variable from the class AirLine
        System.out.println("Ticket Reservation:" + AirLine.airline);
        System.out.println("=================================");
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Passport Number:" + passportNum);
        System.out.println("Phone Number:" + phoneNum);

    }

    public void getFlightDetails() {
        System.out.println("Flight Name:" + flightName);
        System.out.println("Source:" + source);
        System.out.println("Destination:" + destination);
        System.out.println("Departure:" + departure);
        System.out.println("Arrival:" + arrival);
    }

    public void bookSeat(String seatNum, String classType) {
        System.out.println("Seat Number:" + seatNum);
        System.out.println("classType:" + classType);
    }


    public void getPayment(String cardNum, String currency, long price) {
        System.out.println("Card Number:" + cardNum);
        System.out.println("Currency:" + currency);
        System.out.println("Ticket Price:" + price);
    }
}
