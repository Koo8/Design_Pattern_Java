package AbstractFactory_BankLoan;

public class DemoMain {
    public static void main(String[] args) {
        Factorycreator factorycreator = new Factorycreator();
        String newWFC = factorycreator.chooseFactory("Bank").getBank("WFC").getBankName();
        System.out.println(newWFC);

    }
}
