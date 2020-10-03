package AbstractFactory_BankLoan;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if(bank.equalsIgnoreCase("WFC")) {
            return new WFC();
        } else if (bank.equalsIgnoreCase("JPM")) {
            return new JPM();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
