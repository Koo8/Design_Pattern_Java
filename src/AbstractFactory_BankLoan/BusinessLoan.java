package AbstractFactory_BankLoan;

public class BusinessLoan extends Loan {
    @Override
    void setInterestRate(double r) {
        rate = r;
    }
}
