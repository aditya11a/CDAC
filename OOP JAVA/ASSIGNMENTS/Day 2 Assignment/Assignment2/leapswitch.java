
import java.util.Scanner;

public class leapswitch 
{
    public static void main(String[] args) 
    {
         Scanner c=new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year=c.nextInt();
        
        switch ( year%4==0 && (year%100!=0 || year%400==0)?1:0) {
            case 1:
                System.out.println(year+" is a leap year");
                
                break;
            case 0:
                System.out.println(year+" is not a leap year");
                
            break;
            default:
                System.out.println(year+" is not a leap year");
            
        }
    }
}