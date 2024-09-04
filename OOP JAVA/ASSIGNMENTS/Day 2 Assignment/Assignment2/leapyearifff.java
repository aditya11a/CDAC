import java.util.Scanner;

public class leapyearifff {
    public static void main(String[] args) 
    {
        
        Scanner c=new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year=c.nextInt();
        if(year%400==0 || (year%100==0 && year%4==0))
        {
            System.out.println(year+" is a Leap year");
        }
        else
        {
            System.out.println(year+" is not a Leap year");
        }
   
    }
    
}
