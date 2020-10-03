package AbstractFactory_BankLoan;

public class JPM implements Bank{

    private final String BankName;

    public JPM() {
        BankName = "JPM";
    }

    @Override
    public String getBankName() {
        return BankName;
    }
}
