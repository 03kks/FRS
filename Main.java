public class Main {
    public static void main(String[] args) {
        //Main.java have to types to run, Ticket regular and Touristticket

        TouristTicket touristTicket = new TouristTicket("920092", "India", "England",
                "DepartureInfo", "ArrivalInfo",
                "32", 7600, false, null, null,
                "Lords Hotel", new String[]{""});

        Ticket regularTicket = new RegularTicket("989372", "Mumbai",
                "Bhopal", "DepartureInfo", "ArrivalInfo",
                "23", 2450, false, null, null, "lunch");


        printTicketDetails(touristTicket);

        printTicketDetails(regularTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}

