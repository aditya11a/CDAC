//Reverse a String

public class Q4 {
    public static void main(String[] args) {
        Q4 obj=new Q4();
        //obj.reverseString("java");
        System.out.println("Reversed String : "+ obj.reverseString("java"));
    }
    public static void main1(String[] args) {
        String a="hello";
        String b="";
        int len=a.length();
        for(int i=len-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        System.out.println(""+b);
    }
    String reverseString(String a)
    {
        String b;
        b=a;
        String c="";
        int len=b.length();
        for(int i=len-1;i>=0;i--)
        {
            c=c+b.charAt(i);
        }
        return c;
    }
    
}