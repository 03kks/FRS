public class RegularTicket extends Ticket {
    private String specialServices;
    //make class RegularTicket including all the attributes. make it public.
    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float ticketPrice, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices) {
        //use super constructor
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, ticketPrice, cancelled,
                flight, passenger);
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
