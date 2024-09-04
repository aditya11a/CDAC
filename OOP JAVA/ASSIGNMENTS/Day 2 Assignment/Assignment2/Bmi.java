import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight=sc.nextDouble();
        System.out.println("Enter 2 To find out the area of Square");
        double height=sc.nextDouble();

        double bmi = weight / (height*height);
        if (bmi < 18.5) 
            System.out.print("underweight"); 
  
        else if (bmi >= 18.5 && bmi < 24.9) 
            System.out.print("Healthy"); 
  
        else if (bmi >= 24.9 && bmi < 30) 
            System.out.print("overweight"); 
  
        else if (bmi >= 30) 
            System.out.print("Suffering from Obesity");  
    }
}
