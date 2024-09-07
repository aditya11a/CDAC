public class comline
{
	public static void main(String args[])
	{
		
		int numa=Integer.parseInt(args[0]);
		int numb=Integer.parseInt(args[1]);
		//char c=Character.parseChar(args[2]);
		char ch=args[2].charAt(0);
		System.out.println("NUMBER 1 ="+numa);
		System.out.println("NUMBER 2 ="+numb);
		
		switch(ch)
		{
			case '+':
				int add=numa+numb;
				System.out.println("Addition of "+numa+"&"+numb+"is :"+add);
			break;
			case '-':
				int sub=numa-numb;
				System.out.println("Substraction of "+numa+"&"+numb+"is :"+sub);
			break;
			case '*':
				int mul=numa*numb;
				System.out.println("Multiplication of "+numa+"&"+numb+"is :"+mul);
			break;
			case '/':
				int div=numa/numb;
				System.out.println("Division of "+numa+"&"+numb+"is :"+div);
			break;
			default:
				System.out.println("Invalid input");
		}
		
		
		
	
	}
}