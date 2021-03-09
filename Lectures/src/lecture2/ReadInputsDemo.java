package lecture2;
//importing scanner class
import java.util.Scanner;
public class ReadInputsDemo {
	
		public static void main(String []args)
		{
			//classname objectname = new classname(pram1,param2,,,);
			Scanner s = new  Scanner(System.in);
			
			System.out.println("Enter the value of a");
			
			int a;
			a = s.nextInt();
			
			System.out.println("Enter the value of b");
			
			int b = s.nextInt();
		
			System.out.println("The value of a is : "+a+" and b is :"+b+" Their sum is : "+(a+b));
			System.out.println("The value of a is : "+a+" and b is :"+b+" Their diff is : "+(a-b));
			System.out.println("The value of a is : "+a+" and b is :"+b+" Their product is : "+(a*b));
			System.out.println("The value of a is : "+a+" and b is :"+b+" Their division is : "+(a/b));
		}

}
//WAP to read an input of five decimal values and one string value . Perform addition of all those decimal values and display the average of them 
//under the string name.
