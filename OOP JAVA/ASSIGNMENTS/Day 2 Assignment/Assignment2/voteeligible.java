import java.util.Scanner;

public class voteeligible 
{
    public static void main(String[] args) 
    {
        
        Scanner c=new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int Age=c.nextInt();
        if(Age>=18)
        {
            System.out.println("Hello your age is "+Age+" and you are elligible for Voting");
        }    
        else
        {
            System.out.println("Hello your age is "+Age+" and you are not elligible for Voting");
        }
    } 
}
