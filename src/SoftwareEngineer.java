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
        return super.getSuccessfulCheckIns();
    }

    public boolean checkInCode() {
        TechnicalLead manager = (TechnicalLead) getManager();
        if (manager.approveCheckIn(this)) {
            super.setSuccessfulCheckIns(super.getSuccessfulCheckIns() + 1);
            return true;
        }
        return false;
    }
}
