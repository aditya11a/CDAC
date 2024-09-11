package ArrayCodes;
import java.util.Scanner;
class getsetacc{
	void acceptrecord(int arr[]) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+i+" index number:");
			arr[i]=sc.nextInt();
		}
	}
	void printrecord(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+i+" index number:"+arr[i]);
			
		}
	}
	
	
}

public class Problem2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		getsetacc p=new getsetacc();
		p.acceptrecord(arr);
		p.printrecord(arr);
		
	}
	
}


