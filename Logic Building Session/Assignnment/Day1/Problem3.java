import java.util.*;
public class Problem3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Entered number "+num+" is even");
		}
		else
		{
			System.out.println("Entered number "+num+" is odd");
		}
	}
}