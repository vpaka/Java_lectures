package lecture06;

//template class
public class Student {
	//instance variables
	//accessspecifier datatype variable;
	private int studentid;
	private String name;
	
	//default constructor
	Student()
	{
		this.studentid=10000;
		this.name= "Unknown";
	}
	
	//parameterised constructor
	Student(int id, String n)
	{
		this.setStudentid(id);
		this.setName(n);
		
	}
	
	//setters 
	public void setStudentid(int id)
	{
		this.studentid=id;
	}
	
	public void setName(String n)
	{
		this.name=n;
	}
	
	
	//getters
	public int getStudentid()
	{
		return this.studentid;
	}
	
	public String getName()
	{
		return this.name;
	}
	//convert all the values of the instance variables into a string and 
	//parse them together as a single string
	public String toString()
	{
	return "Student id:\t"+this.getStudentid()+"\n"+"Student name:\t"+this.getName();
	}

	

}
