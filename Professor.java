package education;
public class Professor extends Person 
{
	private String subject1;
	private String subject2;
	
	Professor(String name,String course,int age)
	{
		super(name,course,age);
	}
	
	public String getSubject1() 
	{
		return subject1;
	}
	
	public void setSubject1(String subject1) 
	{
		this.subject1 = subject1;
	}
	
	public String getSubject2() 
	{
		return subject2;
	}
	
	public void setSubject2(String subject2) 
	{
		this.subject2 = subject2;
	}
	
	public String toString()
	{
		return super.toString();
	}
}