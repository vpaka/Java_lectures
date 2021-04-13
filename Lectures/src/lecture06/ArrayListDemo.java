package lecture06;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args)
	
	{
		ArrayList alist=new ArrayList<String>();
		alist.add("60");
		alist.add("100");
		alist.add("dfgh40");
		//System.out.println(alist.toString());
		
		//System.out.println(alist);
		//alist.remove(0);
		System.out.println(alist);
	
		//alist.remove("60");
		System.out.println(alist);
		System.out.println(alist.get(2));
		System.out.println(alist.size());
		
		
		
	}

}
