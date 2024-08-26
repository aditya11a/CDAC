/Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6)*/
public class problem7
{
	public static void main (String args[])
	{
		int num=9876;
		System.out.println("Number="+num);
		int sum=0;
		while(num!=0)
		{
			int num1=num%10;
			sum=sum+num1;
			num=num/10;
		}
		System.out.println("Addition Of digits: "+sum);
	}
}