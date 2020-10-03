package AbstractFactory_BankLoan;

/**
 * SuperClass for BankFactory and LoanFactory
 */
public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);

}
