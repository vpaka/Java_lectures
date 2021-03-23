package lecture4;
import java.util.Scanner;
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a positive number to start the count");
		int count = s.nextInt();
		
		while(count>=0)
		{
			System.out.println("Count is\t"+count );
			count--;
		}
		
		System.out.println("I am a statement after while loop");
		

	}

}
