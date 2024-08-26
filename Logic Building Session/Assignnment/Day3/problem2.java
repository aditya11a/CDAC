/*Write a program to compute the factorial of the number 10.*/
import java.util.*;
public class problem2
{
	public static void main (String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=obj.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of "+num+"numbers is:"+fact);
		
		
	}
}