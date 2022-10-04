package Flight;

public class CrewMember extends Person implements ServAble{
    private float salary;
    private FlightCrewJob job;

    public CrewMember(String name) {
        super(name);
    }

    public CrewMember(Ticket ticket, double creditCardLimit, String[] luggage) {
        super(ticket, creditCardLimit, luggage);


    }
    @Override
    public String toString() {
        return "CrewMember{" +
                "salary=" + salary +
                ", job=" + job +
                '}';
    }

    @Override
    public void serve(Person x) {

    }

    @Override
    public void serve() {

    }

    public float getSalary() {
        return salary;
    }
}
