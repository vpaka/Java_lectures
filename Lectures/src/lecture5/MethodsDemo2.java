package lecture5;

import java.util.Scanner;

public class MethodsDemo2 {
	
	//A method which do not have any parameters nor return value
	public void addition()
	{
		int a=50;
		int b=500;
		System.out.println("The sum of "+a+" and "+b+ " is "+(a+b));
		
	}
	
	//A method which has parameters but no return value
	public void subtr(int x, int y) //parameters
	{
		
		System.out.println("The value of x is :" +x);
		System.out.println("The value of y is :" +y);
		System.out.println("The diff of "+x+" and "+y+ " is "+(x-y));
	}
	
	//A method which do not have parameters but has a return value
	public int product()
	{
		int i=10;
		int j=20;
		System.out.println("********************");
		System.out.println("The value of i is :" +i);
		System.out.println("The value of j is :" +j);
		int result=i*j;
		return result;
	}
		
	//A method which has both parameters and a return value
	public double div(double d, double f)
	{
		double result = d/f;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// classtype object = new classtype();
		
		MethodsDemo2 md = new MethodsDemo2();
		md.addition();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of numb1");
		int valu1=s.nextInt();
		System.out.println("Enter the value of numb2");
		int valu2=s.nextInt();
		
		
		md.subtr(valu1, valu2); // arguments
		
		System.out.println(md.product());
		
		int var2=md.product();
		System.out.println(var2);
		
		double divResult=md.div(valu1, valu2);
		
		System.out.println(" the result from division is "+ divResult);

		
	}

}
