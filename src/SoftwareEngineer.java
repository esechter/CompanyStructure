public class SoftwareEngineer extends TechnicalEmployee {
    private boolean codeAccess;

    public SoftwareEngineer(String name) {
        super(name);
        this.codeAccess = false;
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        codeAccess = access;
    }

    public int getSuccessfulCheckIns() {
        return super.successfulCheckIns;
    }

    public boolean checkInCode() {
        TechnicalLead manager = (TechnicalLead) getManager();
        if (manager.approveCheckIn(this)) {
            successfulCheckIns ++;
            return true;
        }
        return false;
    }
}
