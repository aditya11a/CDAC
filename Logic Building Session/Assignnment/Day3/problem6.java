/*   Write a program to find and print the firite a program to find and print the first 5 prime numbers. Write a program to find and print the first 5 prime numbers*/
public class probolem6 {
  public static void main(String[] args) {
    int num = 20;  
    int count;  

    
    for (int i = 1; i <= num; i++) {
      count = 0; 

      
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          count++;  
          break; 
        }
      }

     
      if (count == 0) {
        System.out.println(i);  
      }
    }
  }
}