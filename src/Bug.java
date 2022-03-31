public class Bug implements ConsoleNotification {
    private String descriptionBug;
    private BugReporter bugReporter;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String descriptionBug, BugReporter bugReporter, int bugPriority) {
        this.descriptionBug = descriptionBug;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.bugStatus = bugStatus;
    }

    public String getDescriptionBug() {
        return descriptionBug;
    }

    public void setDescriptionBug(String descriptionBug) {
        this.descriptionBug = descriptionBug;
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setbugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default: {
                System.out.println("Incorrect bug priority range");
            }
        }
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        notifyStatusChange();
        this.bugStatus = bugStatus;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "descriptionBug='" + descriptionBug + '\'' +
                ", email=" + bugReporter +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                '}';
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Status buga się zmienił.");
    }
}
