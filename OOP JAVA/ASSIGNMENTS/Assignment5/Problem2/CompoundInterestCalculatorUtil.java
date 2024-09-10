package com.Sid.in;

import java.util.Scanner;

class CompoundInterestCalculatorUtil {
	Scanner scanner = new Scanner(System.in);
    private CompoundInterestCalculator compoundInterestCalculator;
   
    public void acceptRecord() {
        System.out.print("Enter Initial Investment Amount (in ₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter Number of Compounds per Year: ");
        int numberOfCompounds = scanner.nextInt();
        System.out.print("Enter Investment Duration (in years): ");
        int years = scanner.nextInt();

        compoundInterestCalculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
    }

    public void printRecord() {
        
            System.out.println(compoundInterestCalculator);  // Display investment details
            double futureValue = compoundInterestCalculator.calculateFutureValue();
            double totalInterest = compoundInterestCalculator.calculateTotalInterest();
            System.out.printf("Future Value: ₹%.2f\n", futureValue);
            System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest); 
    }

    // Method to display the menu options
    public void menuList() {
        System.out.println("1. Enter Investment Details");
        System.out.println("2. Display Future Value and Total Interest");
        System.out.println("3. Exit");
    }
}
