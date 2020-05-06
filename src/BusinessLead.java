import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee implements Manager {
    private static final int DEFAULT_HEADCOUNT = 10;
    int headCount;
    ArrayList<Accountant> reports;

    public BusinessLead(String name) {
        super(name, DEFAULT_SALARY * 2);
        setHeadcount(DEFAULT_HEADCOUNT);
    }

    @Override
    public boolean requestbonus(Employee e, double bonus) {
        if (bonus < getBonusBudget()) {
            setBonusBudget(getBonusBudget() - bonus);
            return true;
        }
        return false;
    }

    @Override
    public void setHeadcount(int heads) {
        this.headCount = heads;
    }

    @Override
    public boolean hasHeadCount() {
        return headCount < reports.size();
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            reports.add(e);
            setBonusBudget(getBonusBudget() + (e.getBaseSalary() * 1.1));
            e.supportTeam(supportTeam);
            return true;
        }
        return false;
    }

    public boolean approveBonus (Employee e, double bonus) {
        for (Accountant a : reports) {
            if (a.getTeamSupported().equals(e.getManager())) {
                return a.approveBonus(bonus);
            }
        }
        return false;
    }
}
