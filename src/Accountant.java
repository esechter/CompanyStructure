import java.time.temporal.TemporalAccessor;

public class Accountant extends BusinessEmployee {
    TechnicalLead teamSupported;

    public Accountant(String name) {
        super(name);
        setBonusBudget(0);
    }

    public TechnicalLead getTeamSupported() {
        return teamSupported;
    }

    public void supportTeam(TechnicalLead lead) {
        teamSupported = lead;
        setBonusBudget(lead.headCount * TechnicalEmployee.DEFAULT_SALARY * 1.1);
    }

    public boolean approveBonus(double bonus) {
        return bonus < getBonusBudget();
    }

    @Override
    public String employeeStatus() {
        return super.employeeStatus + " is supporting " + teamSupported.getName();
    }
}
