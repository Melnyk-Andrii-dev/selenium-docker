package tests.flightreservation.model;

public class FlightReservationTestData {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String street;
    private String city;
    private String zip;
    private String passengersCount;
    private String expectedPrice;

    public FlightReservationTestData() {
    }

    public String getFirstName() {
        return firstName;
    }

    public FlightReservationTestData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public FlightReservationTestData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public FlightReservationTestData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FlightReservationTestData setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public FlightReservationTestData setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public FlightReservationTestData setCity(String city) {
        this.city = city;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public FlightReservationTestData setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getPassengersCount() {
        return passengersCount;
    }

    public FlightReservationTestData setPassengersCount(String passengersCount) {
        this.passengersCount = passengersCount;
        return this;
    }

    public String getExpectedPrice() {
        return expectedPrice;
    }

    public FlightReservationTestData setExpectedPrice(String expectedPrice) {
        this.expectedPrice = expectedPrice;
        return this;
    }
}
