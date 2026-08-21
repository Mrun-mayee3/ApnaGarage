public class Customer {
    private String name;
    private String Contact;
    private Car car;

    public Customer(String name, String contact, Car car) {
        this.name = name;
        this.Contact = contact;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return Contact;
    }

    public Car getCar() {
        return car;
    }
}
