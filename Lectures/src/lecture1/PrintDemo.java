package lecture1;
import java.util.Scanner;
public class PrintDemo {
	
	public static void main(String args[])
	{
		
		System.out.println("____Hello Class1!____");
		System.out.print("____Hello Class2!____");
		System.out.print("____Hello Class3!____");
		System.out.println("____Hello Class4!____");
		System.out.print("____Hello Class5!____");
		System.out.println("");
		
		System.out.println(10+20); //addition
		System.out.println("10"+20); // concatenation
		System.out.println("10"+20+"60"); // concatenation
		System.out.println('1'+10); 
		System.out.println(10/20); 
		System.out.println(10%20); 
		
		// 8 Basic data types
			/* byte 
			 * short integer
			 * integer
			 * long integer
			 * double
			 * boolean
			 * Char
			 * float
			 */
		
		//variables
			/* Syntax
			 * datatype variablename = value ;
			 * 
			 * 
			 */
			
		System.out.println("**************");
		
		int a; //variable of type integer is declared 
		
		a=10; //assigning a value
		
		int b = 200; 
		
		System.out.println(b); 
		System.out.println(a); 
		
		boolean var1 = false;
		System.out.println(var1); 
		
		System.out.println(10>5); 
		
		double var2 = 20.56;
		
		System.out.println(var2);
		
		double var3 = 20;
		
		System.out.println(var3);
		
		char var4 = '^';
		System.out.println(var4);
		
		
		String var5 = "something";
		
		System.out.println("The value of a is : "+a+" and b is :"+b+" Their sum is : "+(a+b));
		
		System.out.println("The value of a is : "+a+" and b is :"+b+" Their sum is : "+a+b);
		
		
		
	}

}
