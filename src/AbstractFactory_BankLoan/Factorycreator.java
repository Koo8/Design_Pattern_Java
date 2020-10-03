package AbstractFactory_BankLoan;

public class Factorycreator {
    public AbstractFactory chooseFactory(String factoryName) {
        if(factoryName.equalsIgnoreCase("Bank" )) {
            return new BankFactory();
        }  else if(factoryName.equalsIgnoreCase("LOAN")) {
            return new LoanFactory();
        }
        return null;
    }
}
