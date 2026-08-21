import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Driver class
public class UserInterface {
    private Map<String,Customer> customers;
    private List<Service> availableServices;

    public UserInterface(Map<String, Customer> customers, List<Service> availableServices) {
        this.customers = new HashMap<>();
        this.availableServices = new ArrayList<>();
    }
    public void addCustomer(String name, String contact, String carNumber, String model){
        Car car = new Car(carNumber, model);
        Customer customer = new Customer(name,contact,car);
    }
}
