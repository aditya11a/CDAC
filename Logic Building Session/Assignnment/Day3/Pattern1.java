public class Pattern1
{
	public static void main (String args[])
	{
		int j;
		for(int i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			if(i==5)
			{
				break;
			}
		}
	}
}