package AbstractFactory_BankLoan;

import Utility.CalculateLoan;

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
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanAmount+" you have borrowed");

    }
}
