import java.util.Scanner;
import java.lang.Math;
class LoanAmortizationCalculator {
	int principal;
	int annualIntrest;
	int loanTerm;
	Scanner sc=new Scanner(System.in);
    public void acceptRecord(){
		System.out.println("Enter Principal Amount:");
		this.principal=sc.nextInt();
		System.out.println("Enter Annual Intrest:");
		this.annualIntrest=sc.nextInt();
		System.out.println("Enter Loan Term:");
		this.loanTerm=sc.nextInt();
	}
	public double calculateMonthlyPayment(){
		double monthlyIntrestRate=annualIntrest/12/100;
		int numberOfMonths=loanTerm*12;
		double monthlPaymentCalcu=principal * (monthlyIntrestRate * Math.pow((1 + monthlyIntrestRate), numberOfMonths)) 
                /(Math.pow((1 + monthlyIntrestRate), numberOfMonths) - 1);
		return monthlPaymentCalcu;
	}
	void printrecord(){
		System.out.println("Principal Amount:"+principal);
		System.out.println("Annual Intrest: "+annualIntrest);
		System.out.println("Total Loan Span: "+loanTerm);
		System.out.println("Monthly Payment: "+calculateMonthlyPayment());
	}
    
}

public class Problem1 {
    public static void main(String[] args) {
		LoanAmortizationCalculator calculator=new LoanAmortizationCalculator();
		calculator.acceptRecord();
		calculator.calculateMonthlyPayment();
		calculator.printrecord();
        
    }
    
}
