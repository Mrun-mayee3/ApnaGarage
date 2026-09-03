import javax.xml.transform.Source;
import java.util.*;

// Driver class
public class UserInterface {
    private Map<String,Customer> customers;
    private List<Service> availableServices;

    public UserInterface() {
        this.customers = new HashMap<>();
        this.availableServices = new ArrayList<>();
        loadServices();
    }
    public void loadServices(){
        availableServices.add(new Service("Car wash", 400.0));
        availableServices.add(new Service("Wheel Alignment", 200.0));
        availableServices.add(new Service("Oil change", 600.0));
        availableServices.add(new Service("Puncture", 60.0));
        availableServices.add(new Service("Tyre Replacement", 2500.0));
    }

    public void addCustomer(String name, String contact, String carNumber, String model){
        Car car = new Car(carNumber, model);
        Customer customer = new Customer(name,contact,car);
        customers.put(carNumber, customer);
        System.out.println("Customer added successfully");
    }
    public void createInvoice(String carNumber){
        Scanner sc = new Scanner(System.in);
        Customer customer = customers.get(carNumber);
        Invoice invoice = new Invoice(customer);

        if(!customers.containsKey(carNumber)){
            System.out.println("No customer found with car number: "+carNumber);
            return ;
        }

        System.out.println("Available Services: ");
        for (int i = 0; i<availableServices.size(); i++){
            System.out.println((i + 1)+". "+ availableServices.get(i).getName()+ " - ₹"+availableServices.get(i).getPrice());
        }

        while(true){
            System.out.println("Enter Service number to add: ");
            int choice = sc.nextInt();
            if(choice == 0){
                break;
            }
            if(choice > 0 && choice <=availableServices.size()){
                invoice.addService(availableServices.get(choice-1));
                System.out.println("Service added!");
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        invoice.printInvoice();
    }
}
