import java.util.*;
public class Problem7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered First Number:");
		int num1=sc.nextInt();
		System.out.println("Entered Second Number:");
		int num2=sc.nextInt();
		System.out.println("Entered Third Number:");
		int num3=sc.nextInt();
		if(num1>num2 && num2>num3)
		{
			System.out.println("First Number is Greatest: "+num1);
		}
		else if(num1>num2 && num2>num3)
		{
			System.out.println("Second Number is Greatest: "+num2);
		}
		else
		{
			System.out.println("Third Number is Greatest: "+num3);
		}
	}
}