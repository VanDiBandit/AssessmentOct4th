package Flight;


public enum FlightCrewJob {

PILOT(flightCrewJob1), CO_PILOT(flightCrewJob2), FLIGHT_ATTENDANT(flightCrewJob3);

private String flightCrewJob1 = "";
private String flightCrewJob2 = "";
private String flightCrewJob3= "";

    FlightCrewJob(String flightCrewJob1, String flightCrewJob2, String flightCrewJob3){
        this.flightCrewJob1 = flightCrewJob1;
        this.flightCrewJob2 = flightCrewJob2;
        this.flightCrewJob3 = flightCrewJob3;
    }
}
