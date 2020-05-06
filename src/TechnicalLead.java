import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee implements Manager{
    private static final int DEFAULT_HEADCOUNT = 4;
    int headCount;
    ArrayList<SoftwareEngineer> reports;

    public TechnicalLead(String name) {
        super(name, DEFAULT_SALARY * 1.3);
        setHeadcount(DEFAULT_HEADCOUNT);
    }

    public boolean hasHeadCount() {
        return headCount < reports.size();
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

        return false;
    }

    @Override
    public void setHeadcount(int heads) {
        this.headCount = heads;
    }

    public String getTeamStatus() {
        if (reports.isEmpty()) {
            return employeeStatus + " and no direct reports yet";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(employeeStatus + "and is managing: \n");
        for (SoftwareEngineer e : reports) {
            sb.append(e.employeeStatus + "\n");
        }
        return sb.toString();
    }
}
