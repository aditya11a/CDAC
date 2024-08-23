import java.util.Scanner;
public class Problem2
{
	public static void main (String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Number: ");
		double num=sc.nextDouble();
		if(num<0)
		{
			System.out.println("Negative Number: "+num);
		}
		else 
		{
			System.out.println("Positive Number: "+num);
		}
	}
}