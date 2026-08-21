import javax.xml.transform.Source;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Service> serviceList;
    private double totalAmount;

    public Invoice(Customer customer, List<Service> serviceList, double totalAmount) {
        this.customer = customer;
        this.serviceList = serviceList;
        this.totalAmount = totalAmount;
    }
    public void addService(Service service){
        serviceList.add(service);
        totalAmount += service.getPrice();
    }

    public  void printInvoice(){
        System.out.println("--------------Your Bill--------------");
        System.out.println("Customer: " + customer.getName() + " | Phone" + "Contact: "+customer.getContact());
        System.out.println("Car: "+customer.getCar().getCarModel()+ "| Number: "+customer.getCar().getCarNumber());
        System.out.println("Your Services------->");

        for(Service service:serviceList){
            System.out.println(service.getName() + ": ₹"+service.getPrice());
        }

        System.out.println("Total Amount: ₹"+ totalAmount);
        System.out.println("-------------------------------------");
    }
}
