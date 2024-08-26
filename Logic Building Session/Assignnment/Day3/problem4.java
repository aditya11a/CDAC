import java.util.*;
public class problem4
{
	public static void main (String args[])
	{
		int num=12345;
		System.out.println("Number="+num);
		int reverse=0;
		while(num!=0)
		{
			int reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
		System.out.println("reverse Number="+reverse);
	}
}