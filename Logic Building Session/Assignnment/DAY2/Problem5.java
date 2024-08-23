/*Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 
*/
import java.util.*;
public class Problem5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Score in Subject1: ");
		int score1=sc.nextInt();
		
		System.out.println("Enter Score in Subject2: ");
		int score2=sc.nextInt();
		
		System.out.println("Enter Score in Subject3: ");
		int score3=sc.nextInt();
		
		int count=0;
		
		switch(score1>40?1:0)
		{
			case 0:
			count++;
			break;
		}
		switch(score2>40?1:0)
		{
			case 0:
			count++;
			break;
		}
		switch(score3>40?1:0)
		{
			case 0:
			count++;
			break;
		}
		switch(count)
		{
			case 0:
			System.out.println("YOU ARE PASS");
			break;
			
		
			case 1:
			System.out.println("YOU ARE FAILED IN "+count+"subjects");
			break;
		}
			
		
	}
}