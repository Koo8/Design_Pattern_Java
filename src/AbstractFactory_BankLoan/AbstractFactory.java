package AbstractFactory_BankLoan;

/**
 * SuperClass for BankFactory and LoanFactory
 * AbstractFactory usually defines a different
 * operation for each kind of product it can produce. The kinds of products
 * are encoded in the operation signatures(such as Bank, Loan)
 * Adding a new kind of product requires changing the AbstractFactory
 * interface and all the classes that depend on it.
 */
public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);

}
