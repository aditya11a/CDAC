import java.util.*;
public class problem3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();
		System.out.println("Enter number");
		int num2=sc.nextInt();
		System.out.println("Enter Operator: ");
		char opp=sc.next().charAt(0);
		int result;
		switch(opp)
		{
			case '+':
				result=num1+num2;
				System.out.println("Addition of two numbers "+num1+"and"+num2+"is:"+result);
			break;
			case '-':
				result=num1-num2;
				System.out.println("Substraction of two numbers "+num1+"and"+num2+"is:"+result);
			break;
			case '*':
				result=num1*num2;
				System.out.println("Multiplication of two numbers "+num1+"and"+num2+"is:"+result);
			break;
			case '/':
			result=num1/num2;
			if(num2==0)
			{
				result=num1/num2;
				System.out.println("Invalid Division By Zero not Possible");
				break;
			}
			System.out.println("Division of two numbers "+num1+"and"+num2+"is:"+result);
			break;
			default:
				System.out.println("Invalid Operation");
			break;
			
		}
		
	}
}	