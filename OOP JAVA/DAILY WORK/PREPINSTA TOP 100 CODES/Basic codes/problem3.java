import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter Natural number till which you want addition:");
        int number =sc.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++)
        {
            sum=sum+i;
        }
        System.out.println("The Sum of first "+number+" natural numbers is: "+sum);
    }
    
}
