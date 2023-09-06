import java.util.*;

//creating customer
class Customer {
    private String name;
    private int unitsConsumed;
    private int customerId;
    private String customerAddress;

    public Customer(String name, int unitsConsumed, int customerId,
            String customerAddress) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    public String getName() {
        return name;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public String getcustomerAddress() {
        return customerAddress;
    }

    public int getcustomerId() {
        return customerId;
    }

}

// calculate bill based on unit consumed
class BillCalculator {

    public static double calculateBill(int unitsConsumed) {
        if (unitsConsumed <= 200) {
            double RATE_PER_UNIT = 4.0;
            return unitsConsumed * RATE_PER_UNIT;
        } else if (unitsConsumed > 200 && unitsConsumed < 450) {
            double RATE_PER_UNIT = 6.0;
            return unitsConsumed * RATE_PER_UNIT;
        } else {
            double RATE_PER_UNIT = 8.0;
            return unitsConsumed * RATE_PER_UNIT;
        }
    }
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Electricity Billing System");

        // Customer registration
        System.out.print("Enter Customer Id: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        String cName = scanner.nextLine();
        System.out.print("Enter Customer address: ");
        String customerAddress = scanner.nextLine();
        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Create a customer object
        Customer cust = new Customer(cName, unitsConsumed, customerId,
                customerAddress);

        // Calculate the bill
        double billAmount = BillCalculator.calculateBill(cust.getUnitsConsumed());

        // Display the bill
        System.out.println("-----------------------------------------");
        System.out.println("| Customer Id: " + cust.getcustomerId() + " |");
        System.out.println("| Customer Name: " + cust.getName() + " |");
        System.out.println("| Customer address: " + cust.getcustomerAddress() + " |");
        System.out.println("| Units Consumed: " + cust.getUnitsConsumed() + " |");
        System.out.println("| Bill Amount: Rs." + billAmount + " |");
        System.out.println("-----------------------------------------");
        scanner.close();
    }
}
