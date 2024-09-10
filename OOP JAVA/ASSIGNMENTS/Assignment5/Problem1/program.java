package in.rahul.SR;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculatorUtil();
        Scanner scanner = new Scanner(System.in);
        
        int choice;

        do {
            util.menuList();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    util.acceptRecord();   // Accept loan details from user
                    break;
                case 2:
                    util.printRecord();    // Display calculated loan details
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 3);  // Repeat menu until user selects "Exit"
        
        scanner.close();
    }
}