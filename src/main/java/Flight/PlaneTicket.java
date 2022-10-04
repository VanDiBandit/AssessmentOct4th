package Flight;

public class PlaneTicket extends Ticket{
    private boolean isFrequentFlyer;

    public PlaneTicket(int id, String origin, String Destination, String seatNumber, double price) {
        super(id, origin, Destination, seatNumber, price);
    }
}
