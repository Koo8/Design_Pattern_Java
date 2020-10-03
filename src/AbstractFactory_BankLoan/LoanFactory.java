package AbstractFactory_BankLoan;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        }else if (loan.equalsIgnoreCase("Business"))  {
            return new BusinessLoan();
        }
        return null;
    }
}
