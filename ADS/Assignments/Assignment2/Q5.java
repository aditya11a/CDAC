import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n = sc.nextInt();
        
        int []a= new int[n];
       
       
        int len=a.length;
        System.out.println("Enter the elements of an array");
        int z;
        for(z=0;z<len;z++)
        {
            System.out.println("Enter"+z+"th element");
            a[z]=sc.nextInt();
        }


        System.out.println("Orignal Array");
        for(int j=0;j<=n-1;j++)
        {
            System.out.print("--->"+a[j]);
        }
        
        System.out.println();
        System.out.println("Reversed Array");
        for(int k=n-1;k>=0;k--)
        {
            System.out.print("--->"+a[k]);
        }
        sc.close();
    }
}
