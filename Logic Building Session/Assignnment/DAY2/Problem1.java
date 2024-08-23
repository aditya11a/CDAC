public class Problem1
{
	public static void main (String[] args)
	{
		int score=50;
		if(score>=90)
		{
			System.out.println("You have scores A grade");
		}
		else if(score<=89 && score>=80)
		{
			System.out.println("You have scores B grade");
		}
		else if(score<=79 && score>=70)
		{
			System.out.println("You have scores C grade");
		}
		else if(score<=69 && score>=60)
		{
			System.out.println("You have scores D grade");
		}
		else 
		{
			System.out.println("FAIL");
		}
	}
		
}