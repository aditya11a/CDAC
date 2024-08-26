/*1} Write a program to calculate the sum of the first 50 natural numbers. */
public class problem1
{
	public static void main (String args[])
	{
		int naturalnumner=50;
		int sum=0;
		for(int i=1;i<=naturalnumner;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of the first 50 natural numbers is: "+sum);
	}
}	