package lecture3;

public class IncrementandDecrementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		
		//System.out.println("value before increment\t"+a);
		//a++;
		//System.out.println("value after increment\t"+a);
		
		//a--;
		//System.out.println("value after decrement\t"+a);
		
		System.out.println("value after increment\t"+(++a)); //pre increment
		System.out.println("value after increment\t"+(a++)); //post increment
		
		System.out.println("value after increment\t"+a);
		
		int b=9;
		System.out.println("b after increment\t"+(--b)); //pre increment
		System.out.println("b after increment\t"+(b--)); //post increment
		
		System.out.println("b after increment\t"+b);

	}

}
