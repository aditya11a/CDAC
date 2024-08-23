
/*Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. */
import java.util.*;
public class Problem4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer total value:");
		int total=sc.nextInt();
		System.out.println("Membership:");
		boolean membership=sc.nextBoolean();
		
		if(total>=1000)
		{
			if(membership==true)
			{
				int discount=total*25/100;
				int total1=total-discount;
				System.out.println("Your total bill is"+total+"& After discount & membership discount:"+total1);
			}
			else
			{
				int discount=total*20/100;
				int total1=total-discount;
				System.out.println("Your total bill is"+total+"& After discount:"+total1);
			}
		}
		else if(total>=500 && total<=999)
		{
			if(membership==true)
			{
				int discount=total*15/100;
				int total1=total-discount;
				System.out.println("Your total bill is"+total+"& After discount & membership discount:"+total1);
			}
			else
			{
				int discount=total*10/100;
				int total1=total-discount;
				System.out.println("Your total bill is"+total+"& After discount:"+total1);
			}
		}
		else if(total<=500)
		{
			if(membership==true)
			{
				int discount=total*10/100;
				int total1=total-discount;
				System.out.println("Your total bill is"+total+"& After discount & membership discount:"+total1);
			}
			else
			{
				int discount=total*5/100;
				int total1=total-discount;
				System.out.println("Your total bill is"+total+"& After discount:"+total1);
			}
		}
		
		
	}
}	