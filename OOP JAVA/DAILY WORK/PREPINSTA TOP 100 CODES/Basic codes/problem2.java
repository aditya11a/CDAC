import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter number:");
        int number =sc.nextInt();
        if(number%2==0)
        {
            System.out.println(number+" is Even number ");
        }
        else
        {
            System.out.println(number+" is Odd number ");
        }
    }
    
}
