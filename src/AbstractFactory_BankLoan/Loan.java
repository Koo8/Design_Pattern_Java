package AbstractFactory_BankLoan;

import Utility.CalculateLoan;

import java.text.DecimalFormat;

public abstract class Loan {
    protected double rate; // can't set private, because it is accessed by subclass
    // different subclass has different rate
    abstract void setInterestRate(double r) ;
    // all subClass use the same calculatePayment method
    public void calculateLoanPayment(double loanAmount, int years){
        double EMI;
        int n;
        n=years*12;
        rate=rate/1200;
        // format the double
        DecimalFormat df = new DecimalFormat("#.##");
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;
        EMI = Double.parseDouble(df.format(EMI));
        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanAmount+" you have borrowed");

    }
}
