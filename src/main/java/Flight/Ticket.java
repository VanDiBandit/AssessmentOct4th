package Flight;

public abstract class Ticket implements Payable{
    private int id;
    private String origin;
    private String Destination;
    private String seatNumber;
    private double price;

    public Ticket(int id, String origin, String Destination, String seatNumber, double price) {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
