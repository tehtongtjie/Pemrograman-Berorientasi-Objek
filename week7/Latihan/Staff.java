public class Staff extends Employee {
    public Staff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return super.getSalary() * 0.05;
    }

}