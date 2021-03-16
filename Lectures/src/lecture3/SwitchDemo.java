package lecture3;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		//initialization of a var
		System.out.println("Enter the person's age in integer value");
		int age=s.nextInt();
		
		int var1=5;
		//switch based on the value entered by the user 
		
		/* Write a program to read a particular month number and print all the following months from that number 
		 * ex: if the user enters 5 which is May
		 * output has to be
				 * may
				 * june
				 * July
				 * Aug
				 * Sep
				 * oct
				 * nov
				 * Dec 
		 */
		
		switch(age)
		{
			//if the age entered is 0
			case 0: 
			{
				System.out.println("the person is still not born");
			break; //this statement is used to make sure that the program do not executed the next case even though it do not match
			}
			//if the age entered is 5
			case 5:
			{
				System.out.println("the person is a child");
				System.out.println("the value of var1 is "+ var1);
				break;
			}
			//if the age entered is 10
			case 10:
			{
				System.out.println("the person is an adelosent");
				break;
			}
			//if the age entered is 13
			case 13:
			{
				System.out.println("the person is a teenager");
				break;
			}
			//if the age entered is 18
			case 18:
			{
				System.out.println("the person is an adult");
				break;
			}
			//if the age entered is 55
			case 55:
			{
				System.out.println("the person is a senior citizen");
				break;
			}
			//this executes when none of the cases match 
			default:
			{
				System.out.println("Not an interesting age");
				break;
			}
			case 60:
			{
				System.out.println("the person is a senior citizen");
				break;
			}
		}
		
		
		

	}

}
