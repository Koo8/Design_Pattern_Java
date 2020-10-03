package AbstractFactory_BankLoan;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan.equalsIgnoreCase("HomeLoan")) {
            return new HomeLoan();
        }else if (loan.equalsIgnoreCase("BusinessLoan"))  {
            return new BusinessLoan();
        }
        return null;
    }
}
