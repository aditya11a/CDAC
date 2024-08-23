import java.util.Scanner;
public class Problem1
{
	public static void main (String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Positive Number: "+num);
		}
		else
		{
			System.out.println("Negative Number: "+num);
		}
	}
}