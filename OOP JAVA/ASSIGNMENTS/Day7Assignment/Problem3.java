package ArrayCodes;

import java.util.Scanner;

class minmax{
	
		void acceptrecord(int arr[]) {
			Scanner sc =new Scanner(System.in);
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter "+i+" index number:");
				arr[i]=sc.nextInt();
			}
		}
		void min(int arr[]){
			int min =arr[0];
			for(int i=0;i<arr.length;i++)
			{
				
				for(int j=0;j<arr.length;j++) {
					if(arr[i]<min)
					{
						min=arr[i];
					}
					
				}
					
				
			}
			System.out.println("The Minimum number in an array is: "+min);
		}
		void max(int arr[]){
			int max =arr[0];
			for(int i=0;i<arr.length;i++)
			{
				
				for(int j=0;j<arr.length;j++) {
					if(arr[i]>max)
					{
						max=arr[i];
					}
					
				}
					
				
			}
			System.out.println("The Maximum number in an array is: "+max);
		}
	
		
		
}

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		minmax m=new minmax();
		m.acceptrecord(arr);
		m.min(arr);
		m.max(arr);
	}

}
