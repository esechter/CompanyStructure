public abstract class TechnicalEmployee extends Employee {
    final static double DEFAULT_SALARY = 75000;
    int successfulCheckIns;

    public TechnicalEmployee(String name) {
        super(name, DEFAULT_SALARY);
        this.successfulCheckIns = 0;
    }

    public TechnicalEmployee(String name, double salary) {
        super(name, salary);
        this.successfulCheckIns = 0;
    }

    public String employeeStatus() {
        return super.toString() + " has " + this.successfulCheckIns + " successful check-ins";
    }

}
