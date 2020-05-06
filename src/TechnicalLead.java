import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee implements Manager{
    private static final int DEFAULT_HEADCOUNT = 4;
    private int headCount;
    BusinessLead businessLead;
    ArrayList<SoftwareEngineer> reports;

    public TechnicalLead(String name) {
        super(name, DEFAULT_SALARY * 1.3);
        setHeadcount(DEFAULT_HEADCOUNT);
        reports = new ArrayList<>();
    }

    public int getEmployeeCount() {
        return reports.size();
    }

    public boolean hasHeadCount() {
        return  reports.size() < headCount;
    }

    public boolean addReport(SoftwareEngineer e) {
        if (hasHeadCount()) {
            reports.add((SoftwareEngineer) e);
            return true;
        }
        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        return reports.contains(e) && e.getCodeAccess();
    }
    //TODO - implement once business lead is done
    @Override
    public boolean requestbonus(Employee e, double bonus) {
        businessLead.approveBonus(e, bonus);
        return false;
    }

    @Override
    public void setHeadcount(int heads) {
        this.headCount = heads;
    }

    public String getTeamStatus() {
        if (reports.isEmpty()) {
            return super.employeeStatus() + " and no direct reports yet";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.employeeStatus() + " and is managing: \n");
        for (SoftwareEngineer e : reports) {
            sb.append(e.employeeStatus() + "\n");
        }
        return sb.toString();
    }
}
