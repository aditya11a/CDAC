package com.in.IR;
import java.util.Scanner;
public class Program {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        BMITrackerUtil util = new BMITrackerUtil();
        BMITracker tracker = null;
        int choice;

        do {
            util.menuList();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    tracker = util.acceptRecord();  // Accept new record
                    util.printRecord(tracker);      // Display the calculated BMI
                    break;
                case 2:
                   
                        util.printRecord(tracker);  // Display the last BMI record
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 3);
        sc.close();
    }
}
