public abstract class BusinessEmployee extends Employee {
    final static double DEFAULT_SALARY = 50000;
    private double bonusBudget;

    public BusinessEmployee(String name) {
        super(name, DEFAULT_SALARY);
    }

    public BusinessEmployee(String name, double salary) {
        super(name, salary);
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    public String employeeStatus() {
        return super.toString() + " with a budget of " + getBonusBudget();
    }
}
