package lecture4;

import java.util.Arrays;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[5];
		
		System.out.println(a[3]);
		a[2]=600;
		System.out.println(a[2]);
		
		
		int[] b= {12,2,3,40};
		
		System.out.println(b[1]);
		
		System.out.println(b);
		//System.out.println(b[20]);
		System.out.println(b.length);
		
		System.out.println("*********************");
		for(int i=0; i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		
		
		System.out.println("*********************");
		for(int i=0; i<b.length;i++)
		{

			System.out.println(b[i]);
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		

	}

}
