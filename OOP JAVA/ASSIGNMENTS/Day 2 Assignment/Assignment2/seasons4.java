import java.util.Scanner;

public class seasons4 
{
    public static void main(String[] args) 
    {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter Month number : ");
        int num=c.nextInt();
        String[] months={"January","February", //Autum
                            "March","April","May",//Summer
                            "June","july","August","September",//Rainy
                            "October","November","December"//winter
                        };
        int moStringIndex=num-1;
        switch (moStringIndex) {
            case 0,1->{
                System.out.println("The current month is: "+months[moStringIndex]);
                System.out.println("Autum Season");
                break;
            }
            
            case 2,3,4->{
                System.out.println("The current month is: "+months[moStringIndex]);
                System.out.println("Summer Season");
            break;
            }
            case 5,6,7,8->{
                System.out.println("The current month is: "+months[moStringIndex]);
                System.out.println("Rainy Season");
            break;
            }
            case 9,10,11->{
                System.out.println("The current month is: "+months[moStringIndex]);
                System.out.println("Winter Season");
            break;
            }        
            default ->
            {
                System.out.println("Wrong Input");
                break;
            }
        }
                        

            
    }    
    
}
