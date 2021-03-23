package lecture4;

import java.util.Scanner;

public class WhileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String input = s.nextLine().toLowerCase();
		//System.out.println(input.equals("exit"));
		
		while(!(input.equals("exit")))
		{
			System.out.println("You have entered \t"+input);
			System.out.println("type in exit if you want to quit or just press enter");
			input = s.nextLine().toLowerCase();
		}
		

	}

}
