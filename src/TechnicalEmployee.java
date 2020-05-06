public abstract class TechnicalEmployee extends Employee {
    final static double DEFAULT_SALARY = 75000;
    private int successfulCheckIns;

    public TechnicalEmployee(String name) {
        super(name, DEFAULT_SALARY);
    }

    public TechnicalEmployee(String name, double salary) {
        super(name, salary);
        this.successfulCheckIns = 0;
    }

    public int getSuccessfulCheckIns() {
        return successfulCheckIns;
    }

    public void setSuccessfulCheckIns(int successfulCheckIns) {
        this.successfulCheckIns = successfulCheckIns;
    }

    public String employeeStatus() {
        return super.toString() + " has " + this.successfulCheckIns + " successful check-ins";
    }

}
