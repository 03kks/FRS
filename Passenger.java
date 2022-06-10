public class Passenger {
    private static int idCounter = 0;
    private int id;

    private static class passengersAddress {
        String area, city, state;

        passengersAddress(String area, String city, String state) {
            this.area = area;
            this.city = city;
            this.state = state;
        }
    }
    private passengersAddress passengersAddress;

    private static class Contact {
        String PassengerName, phone, email;
        // this keyword for the current object in a method
        Contact(String PassengerName, String phone, String email) {
            this.PassengerName = PassengerName;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;

    public Passenger(String area, String city, String state, String PassengerName, String phone, String email) {
        this.id = ++idCounter;
        this.passengersAddress= new passengersAddress(area, city, state);
        this.contact = new Contact(PassengerName, phone, email);
    }
    //provide getters
    public int getId() {
        return this.id;
    }

    public String getAddressDetails() {
        return "area: " + passengersAddress.area + ", City: " + passengersAddress.city + ", State: " + passengersAddress.state;
    }

    public String getContactDetails() {
        return "Name: " + contact.PassengerName + ", Phone: " + contact.phone + ", Email: " + contact.email;
    }

    public static int getPassengerCount() {
        return idCounter;
    }
}
