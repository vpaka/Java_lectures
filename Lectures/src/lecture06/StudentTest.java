package lecture06;

public class StudentTest {
	public static void main(String[] args)
	{
		
		//creating a student class object 
		Student s1=new Student();
		System.out.println("s1: \t"+s1.toString());
		
		Student s2=new Student();
		System.out.println("s2: \t"+s2.toString());
		s2.setStudentid(123456);
		s2.setName("whoamI?");
		System.out.println("s2: \t"+s2.toString());
		
		System.out.println(s2.getName());
		System.out.println(s2.getStudentid());
		Student s3=new Student(1480850, "Matteo");
		System.out.println(s3.toString());
		
	}

}
