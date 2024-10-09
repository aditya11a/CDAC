public class Q2 {
    public static void main(String[] args) {
        int arr[]={0, 0, 1, 1, 2, 2, 3, 3};
        //int len=arr.length;
        int temp[]=new int[arr.length];
        int j=0;
        int uniquenum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
               
                
            }
        }
        temp[j++]=arr[arr.length-1];//to add the last element 
        //Because the last element is 3 which is repeted but not gets added to the array 
        // 17 line we add it manually
        //int b=temp.length;
        for (int k=0;k<j;k++) {
            System.out.println(temp[k]);
            uniquenum++;
        }
        System.out.println("Output:"+uniquenum);
    }
}
