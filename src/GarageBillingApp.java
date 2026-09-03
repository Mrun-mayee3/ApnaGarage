import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        UserInterface userInterface= new UserInterface();
        Scanner sc = new Scanner(System.in);

        System.out.println("...............Welcome to Apna Garage ...............");
        while(true){
            System.out.println("1.Add Customer");
            System.out.println("2.Show Services");
            System.out.println("3.Exit");
            System.out.println();
            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Customer Name: ");;
                    String name = sc. next();
                    System.out.println("Enter Phone number: ");
                    String phone = sc.next();
                    System.out.println("Enter car number:");
                    String num = sc.next();
                    System.out.println("Enter car Model:");
                    String model = sc.next();

                    //add these all to userinterface
                    userInterface.addCustomer(name, phone, num, model);
                    break;

                case 2:
                    System.out.println("Enter car number: ");
                    String carNo = sc.next();
                    userInterface.createInvoice(carNo);
                    break;

                case 3:
                    System.out.println("Exiting...Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
