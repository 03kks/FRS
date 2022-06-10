import java.time.LocalDateTime;
public class Ticket {
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private String pnr;
    private String from;
    private String to;
    private float ticketPrice;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;
  /*
  using constructors and getters setters for the attributes to return something
   */

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket(String departureDateTime, String arrivalDateTime, String seatNo,
                  String pnr, String from, String to, float ticketPrice, boolean cancelled,
                  Flight flight, Passenger passenger) {
//use this keyword to the current object in a method
        this.seatNo = seatNo;
        this.ticketPrice = ticketPrice;
        this.cancelled = cancelled;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.flight = flight;
        this.passenger = passenger;
        this.pnr = pnr;
        this.from = from;
    }

    public String checkStatus() {
        return cancelled ? "ticket is Cancelled" : " the ticket is Confirmed";
    }

    public int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }
}
