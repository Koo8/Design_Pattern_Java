package AbstractFactory_BankLoan;

public class Factorycreator {
    public static AbstractFactory chooseFactory(String factoryName) {
        if(factoryName.equalsIgnoreCase("Bank" )) {
            return new BankFactory();
        }  else if(factoryName.equalsIgnoreCase("LOAN")) {
            return new LoanFactory();
        }
        return null;
    }
}
