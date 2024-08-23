import java.util.*;
public class Problem4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered Time:");
		int time=sc.nextInt();
		
		if(time>=5 && time<=12)
		{
			System.out.println("Good morning");
		}
		else
		{
			System.out.println("Not a Good morning, you are late");
		}
		
		
	}
}