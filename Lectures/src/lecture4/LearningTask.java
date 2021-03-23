/*
 * write a program to read a bank account number(can be replaced with username and password)
	from the user and validate it based on a hardcoded account credentials and balance.
	if the user fails to authenticate the system should prompt the user to enter a valid 
	details again.

	if the user is authenticated, Give the user the following menu to choose from
	Welcome to MelbournePoly Bank
	    1. Deposit funds (perform deposit operation)
	    2. Withdraw funds (perform withdrawal operation)
	    3. view balance (perform balance check)
	    4. to exit
	
	    if the user enters any value other than the above mentioned options it should display
	    an error message and prompt the user to make a valid selection again
	
	The system has to exit only if the user selects option 4 else it has to show him the menu
	again.

 */

package lecture4;
import java.util.Scanner;
public class LearningTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		final int accountnumber=123456; 
		double balance=0;
		
		System.out.println("Enter you account number");
		int accNumber=s.nextInt();
		boolean done=false;
		
		while(!done)
		{
			if(accNumber==accountnumber)
			{
				System.out.println("************** Welcome to MelbournePoly Bank *****************");
				System.out.println("    1. Deposit funds\n"
								 + "    2. Withdraw funds \n"
						         + "    3. view balance (perform balance check)\n"
						         + "    4. to exit");
				System.out.println("Enter your choice");
				int choice=s.nextInt();
				switch(choice)
				{
				case 1:
				{
					System.out.println("You choose to deposit funds");
					System.out.println("Enter the amount you wish to deposit");
					double amount=s.nextDouble();
					if(amount >0)
					{
						balance+=amount; //balance=balance + amount
						System.out.println("Deposit successful..");
						System.out.println("Your current balance is:\t$"+balance);
					}
					else 
					{
						System.out.println("Deposit amount cannot be negative");
					}
					break;
				}
				case 2:
				{
					System.out.println("You choose to withdraw funds");
					System.out.println("Enter the amount you wish to withdraw");
					double amount=s.nextDouble();
					if(amount<=balance)
					{
						balance-=amount; //balance=balance - amount
						System.out.println("withdrawl successful..");
						System.out.println("Your current balance is:\t$"+balance);
					}
					else
					{
						System.out.println("Withdrawl amount cannot be negative or higher than the account balance");
					}
					break;
				}
				case 3: 
				{
					System.out.println("You choose to view balance");
					System.out.println("Your current balance is:\t$"+balance);
					break;
				}
				case 4:
				{
					System.out.println("You choose to exit\n See you later..");
					done=true;
					//System.exit(0);
					break;
				}
				default:
				{
					System.out.println("Enter a valid choice");
					break;
				}
				}
			}
			else {
				System.out.println("Incorrect account number\n try again ..");
				System.out.println("Enter you account number");
				accNumber=s.nextInt();
			}
		}
		
		
		

	}

}
