package Bank;

public class Bank {
    private Customer[] customers = new Customer[5];
    private int numberOfCustomers = 0;

    public Bank() {
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < 5) {
            customers[numberOfCustomers++] = new Customer(f, l);
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }
}
