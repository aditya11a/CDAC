public class problem8
{
	public static void main(String[]args)
	{
		int a=10;
		String ab=Integer.toString(a);
		String b=String.valueOf(ab);
		System.out.println("Integer to String"+b);
		
		char c='S';
		String cd=Character.toString(c);
		String d=String.valueOf(cd);
		System.out.println("Character to String"+d);
		
		short e=10;
		String ef=Short.toString(e);
		String f=String.valueOf(ef);
		System.out.println("Short to String"+f);
		
		boolean g=true;
		String gh=Boolean.toString(g);
		String h=String.valueOf(gh);
		System.out.println("Boolean to String"+h);
		
		float i=10.3f;
		String ij=Float.toString(i);
		String j=String.valueOf(ij);
		System.out.println("Float to String"+j);
		
	}
		
	
}
/*char a='a';
		char a=Character.toString();
		String b=String.valueOf(a);
		System.out.println(b);*/