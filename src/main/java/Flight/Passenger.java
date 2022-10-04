package Flight;

public class Passenger extends Person {

    private double creditCardLimit;
    private String[] luggage;

    Ticket ticket;

    public Passenger(Ticket ticket, double creditCardLimit, String[] luggage) {
        super(ticket, creditCardLimit, luggage);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }

    public String[] getLuggage() {
        return luggage;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
