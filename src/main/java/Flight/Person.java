package Flight;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Ticket ticket, double creditCardLimit, String[] luggage) {


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
