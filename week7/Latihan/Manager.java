public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return super.getSalary() * 0.1;
    }
}