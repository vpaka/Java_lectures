package lecture2;

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter a integer value");
		int a = s.nextInt();
		
		if(a>0)
		{
			System.out.println(a+"\tis a positive number");
		}
		else
		{
			System.out.println(a+"\tis a negative number");
		}
	}

}
