package AbstractFactory_BankLoan;

public class WFC implements Bank {
    private final String BankName;

    public WFC() {
        BankName = "WFC";
    }

    @Override
    public String getBankName() {
        return BankName;
    }
}
