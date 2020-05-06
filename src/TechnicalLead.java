import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee implements Manager{
    int headCount;
    ArrayList<SoftwareEngineer> reports;

    public TechnicalLead(String name) {
        super(name, DEFAULT_SALARY * 1.3);
        this.headCount = 4;
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
}
