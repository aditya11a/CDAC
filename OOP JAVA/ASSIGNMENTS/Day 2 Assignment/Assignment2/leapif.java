import java.util.Scanner;

public class leapif
{
    public static void main(String[] args) 
    {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year=c.nextInt();


        if(year%4==0)
        {

            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(year+" is a Leap year +++");
                }
                else
                {
                    System.out.println(year+" is not a Leap year ____");
                   // break;
                }              
            } 
            else{
                System.err.println("sbdfhjfgdhjkn");
            }     
        }
        else
        {
            System.out.println(year+" is not a Leap year ******");
        }
        

    }
}