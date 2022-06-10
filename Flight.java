public class Flight {
    //flight details

    private int capacity;
    private int bookedSeats;
    private String flightNumber;
    private String airways;

    public Flight(String flightNumber, String airways, int capacity, int bookedSeats) {
// use this keyword used for the current object in a method
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
        this.flightNumber = flightNumber;
        this.airways = airways;
    }
    //provide getters and setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirways() {
        return airways;
    }

    public void setAirways(String airline) {
        this.airways = airways;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airways: " + airways +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    public boolean checkAvailability() {
        return bookedSeats < capacity;
    }

    public void incrementBookingCounter() {
        bookedSeats++;
    }
}

