package AbstractFactory_BankLoan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.AbstractList;

public class CalculateEMIPayment {
    public static void main(String[] args) throws IOException {
        // read from ui
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // first question
        System.out.println("Enter the the name of the Bank from where you take your loan? WFC or JPM");
        String bankName = br.readLine();
        //second question
        System.out.println("Enter the type of loan you want to take? Home or Business");
        String loanName = br.readLine();

        // get bank name
        AbstractFactory bankFactory = Factorycreator.chooseFactory("bank");
        Bank bank = bankFactory.getBank(bankName);

        // third question
        System.out.println("enter the interest rate for " + bank.getBankName());
        double rate = Double.parseDouble(br.readLine());

        // forth question
        System.out.println("enter the loan amount you need");
        double loanAmount = Double.parseDouble(br.readLine());

        // fifth question
        System.out.println("enter the amortization years");
        int year = Integer.parseInt(br.readLine());

        AbstractFactory loanFactory = Factorycreator.chooseFactory("loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.setInterestRate(rate);
        loan.calculateLoanPayment(loanAmount,year);
    }
}
