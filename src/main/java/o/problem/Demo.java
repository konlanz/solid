package o.problem;

public class Demo {
    public static void main(String[] args) {
        LoanHandler loanHandler = new LoanHandler();
        User user = new User();

        loanHandler.approvePersonalLoan(user);
        loanHandler.approveMortgage(user);

    }
}
