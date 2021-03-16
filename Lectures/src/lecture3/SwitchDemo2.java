package lecture3;

import java.util.Scanner;

public class SwitchDemo2 {
	
	public static void main(String[] args) {
		
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
		
		Scanner s = new Scanner(System.in);
		
		//initialization of a var
		System.out.println("Enter the month number");
		int month=s.nextInt();
		switch(month)
		{
		case 1: 
		{
			System.out.println("Jan");
		}
		case 2: 
		{
			System.out.println("Feb");
		}
		case 3: 
		{
			System.out.println("Mar");
		}
		case 4: 
		{
			System.out.println("Apr");
		}
		case 5: 
		{
			System.out.println("may");
		}
		case 6: 
		{
			System.out.println("Jun");
		}
		case 7: 
		{
			System.out.println("Jul");
		}
		case 8:
		{
			System.out.println("Aug");
		}
		case 9:
		{
			System.out.println("Sep");
		}
		case 10:
		{
			System.out.println("Oct");
		}
		case 11:
		{
			System.out.println("Nov");
		}
		case 12:
		{
			System.out.println("Dec");
			break;
		}
		default: System.out.println("Not a valid month");
		
		
		}
	}
	

}
