package problem3;
import java.util.Scanner;

class Employee {
    // Static fields
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

    // Non-static fields
    private int employeeID;
    private String employeeName;
    private double salary;

    // Static initializer
    static {
        totalEmployees = 0;
        totalSalaryExpense = 0;
    }

    // Constructor 
    public Employee(int id, String name, double salary) {
        this.employeeID = id;
        this.employeeName = name;
        this.salary = salary;
        totalEmployees++;  // Increment total employees
        totalSalaryExpense += salary;  // Add employee's salary to total expense
    }

 
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    
    public static void applyRaise(double percentage, Employee[] employees) {
        for (Employee emp : employees) {
            double raiseAmount = emp.salary * (percentage / 100);
            emp.salary += raiseAmount;
            totalSalaryExpense += raiseAmount;  
        }
    }

   
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

   
    public void updateSalary(double newSalary) {
        totalSalaryExpense -= this.salary;  
        this.salary = newSalary;  
        totalSalaryExpense += newSalary; 
    }

   
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + employeeName + ", Salary: " + salary;
    }
}




public class empMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[4];  

        
        employees[0] = new Employee(1, "Yash Dhole", 50000);
        employees[1] = new Employee(2, "Saurabh Pawar", 60000);
        employees[2] = new Employee(3, "Kshitij Deshpande", 55000);
        employees[3] = new Employee(4, "Vaibhav Kale", 75000);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. View total employees");
            System.out.println("2. Apply salary raise to all employees");
            System.out.println("3. Calculate total salary expense");
            System.out.println("4. Update salary for an employee");
            System.out.println("5. View all employees");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;
                case 2:
                    System.out.print("Enter raise percentage: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(percentage, employees);
                    System.out.println("Raise applied to all employees.");
                    break;
                case 3:
                    System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
                    break;
                case 4:
                    System.out.print("Enter Employee ID to update salary: ");
                    int empID = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    for (Employee emp : employees) {
                        if (emp.getEmployeeID() == empID) {
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n--- Employee Details ---");
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
