package chapter5;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private  String states;

    public AutoPolicy(int accountNumber, String makeAndModel, String states){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.states = states;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }
    public boolean noFault(){

        return switch (getStates()) {
            case "NY", "MY", "CP", "PA" -> true;
            default -> false;
        };
    }
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy is: ");
        System.out.printf("Account #: %d; Car: %s;%nState %s%s a no fault state%n%n", policy.getAccountNumber(),policy.getMakeAndModel(),policy.getStates(),(policy.noFault() ?  "is" : "is not"));
    }
}
