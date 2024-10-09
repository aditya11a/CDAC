import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int b=0;
        System.out.println("ENTER THE NUMBER");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a!=0) {
            b=b*10+a%10;
            a=a/10;
        }
        System.out.println("Reversed numner: "+b);
        sc.close();
    }
       
}
