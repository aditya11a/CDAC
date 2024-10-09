public class Q6 {
    public static void main(String[] args) {
        String str="Hello World";
        String a[]=str.split(" ");//a[0]-->hello   a[1]--->world
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");//.charAt(i);
        }
    }
}
