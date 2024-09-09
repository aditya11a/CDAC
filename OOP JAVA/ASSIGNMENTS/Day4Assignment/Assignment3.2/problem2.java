import java.util.Scanner;

class CompoundInterestCalculator{
    double investmentamount;
    double intrestrate;
    int investmentduration;
    int intrestcompoudedperyear;

    Scanner sc= new Scanner(System.in);

    void acceptRecord(){
        System.out.println("Enter Invested Amount:");
        investmentamount=sc.nextDouble();

        System.out.println("Enter Intrest Rate:");
        investmentamount=sc.nextDouble();

        System.out.println("Enter Total Duration of Investment:");
        investmentduration=sc.nextInt();

        System.out.println("Enter Times Intrest per year:");
        investmentamount=sc.nextInt();
    }

}

public class problem2 {
    
}
