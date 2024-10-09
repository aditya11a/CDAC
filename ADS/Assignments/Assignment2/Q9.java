public class Q9 {
    public static void main(String[] args) {
        String a="MADAM";
        String b="";
        int len=a.length();
        for(int i=len-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        System.out.println(""+b);
        if(a.equals(b)){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
            
        }
    }
}
