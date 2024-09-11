package designPattern;

import java.security.Identity;
import java.util.IdentityHashMap;

// Design class
 class Singleton {
	 
 private static Singleton instance;   
 public static int cnt=0;
 
 
 
 private Singleton() {
     
 } 

 


 	public static Singleton getInstance() {
 		
     if (instance == null) {
         cnt ++;
         instance = new Singleton();  //assignment
         System.out.println(cnt);
     }
     return instance; 
 }

 
 public void showMessage() {
     System.out.println("Hello from the Singleton instance!");
 }
}
 


 
 
 // main class
public class singletonMain {
 public static void main(String[] args) {
     
     Singleton singleton1 = Singleton.getInstance();
    // singleton1.showMessage();
    // singleton.getValue();
    
     Singleton singleton2 =Singleton.getInstance();
     System.out.println(System.identityHashCode(singleton2));
     System.out.println(System.identityHashCode(singleton1));
     
   //	 Singleton obj =new Singleton();

 }
}

