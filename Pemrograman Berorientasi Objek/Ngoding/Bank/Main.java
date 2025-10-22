package Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Cristiano", "Ronaldo");
        bank.addCustomer("Lionel", "Messi");
        bank.addCustomer("Robert", "Lewandowski");
        bank.addCustomer("Karim", "Benzema");

        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Customer " + (i + 1) + " : " + customer.getFirstName() + " " + customer.getLastName());
        }

        bank.getCustomer(0).setAccount(new Account(100000));
        bank.getCustomer(1).setAccount(new Account(500000));
        bank.getCustomer(2).setAccount(new Account(250000));
        bank.getCustomer(3).setAccount(new Account(50000));

        System.out.println();
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Customer " + (i + 1) + " : " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Saldo : " + customer.getAccount(0).getBalance());
        }

        bank.getCustomer(0).getAccount(0).deposit(50000);
        bank.getCustomer(1).getAccount(0).deposit(100000);
        bank.getCustomer(2).getAccount(0).deposit(100000);
        bank.getCustomer(3).getAccount(0).deposit(50000);

        System.out.println();
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Customer " + (i + 1) + " : " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Saldo (setelah deposit) : " + customer.getAccount(0).getBalance());
        }

        bank.getCustomer(0).getAccount(0).withdraw(25000);
        bank.getCustomer(1).getAccount(0).withdraw(50000);
        bank.getCustomer(2).getAccount(0).withdraw(25000);
        bank.getCustomer(3).getAccount(0).withdraw(10000);

        System.out.println();
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Customer " + (i + 1) + " : " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Saldo (setelah withdraw) : " + customer.getAccount(0).getBalance());
        }
    }
}
