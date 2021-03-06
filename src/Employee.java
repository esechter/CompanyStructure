public abstract class Employee {
    private static int counterForId;
    String name;
    double baseSalary;
    int employeeID;
    Employee manager;
    boolean isManager;

    public Employee (String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = counterForId;
        counterForId++;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Employee getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return getEmployeeID() + " " + getName();
    }

    public boolean equals(Employee other) {
        return this.getEmployeeID() == other.getEmployeeID();
    }

    public abstract String employeeStatus();

}
