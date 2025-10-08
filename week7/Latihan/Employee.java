public abstract class Employee { 
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double getBonus(); 

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getTotalSalary() {
        return salary + getBonus();
    }
}