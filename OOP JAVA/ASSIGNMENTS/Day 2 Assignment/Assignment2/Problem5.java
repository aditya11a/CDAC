/*Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle) 
and then calculates the area based on user-provided dimensions using a switch case. */

import java.util.Scanner;

public class Problem5 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 To find out the area of Circle");
        System.out.println("Enter 2 To find out the area of Square");
        System.out.println("Enter 3 To find out the area of Rectangle");
        System.out.println("Enter 4 To find out the area of Triangle");
        System.out.println("Enter the number :");
        int num=sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Enter the radius of circle: " );
                int radius=sc.nextInt();
                Double areac=3.14*radius*radius;
                System.out.println("Area of Cirle: "+areac);
            break;
            case 2:
                System.out.println("Enter the side of square: " );
                int side=sc.nextInt();
                int areas=side*side;
                System.out.println("Area of Cirle: "+areas);
            break;
            case 3:
                System.out.println("Enter the Length of rectamgle: " );
                int Length=sc.nextInt();
                System.out.println("Enter the Length of rectamgle: " );
                int Breadth=sc.nextInt();
                int  arear=Length*Breadth;
                System.out.println("Area of Cirle: "+arear);
            break;
            case 4:
                System.out.println("Enter the Base of Triangle: " );
                int base=sc.nextInt();
                System.out.println("Enter the Base of Triangle: " );
                int height=sc.nextInt();
                Double area=0.5*base*height;
                System.out.println("Area of Triangle: "+area);
            break;
        
            default:
                System.out.println("You Have Entered Invalid Number of Choice");
        }
    }    
}
