package AbstractFactory_BankLoan;

public class HomeLoan extends Loan {
    @Override
    void setInterestRate(double r) {
        rate = r;
    }
}
