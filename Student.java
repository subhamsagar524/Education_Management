package education;
import java.util.ArrayList;

public class Student extends Person 
{
	private int nosubjects = 0;
	private ArrayList<SubjectTaken> al=new ArrayList<SubjectTaken>();
	
	Student(String name,String address,int age)
	{
		super(name,address,age);
	}
	
	public void addSubjectMark(String subject,int mark)
	{
			SubjectTaken s = new SubjectTaken(subject, mark);
			al.add(s);
			nosubjects++;
	}
	
	public void printMarks()
	{
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i).getMark() + ", ");
		}
	}

	public double getAverageMarks()
	{
		double avg=0;
		
		for(int i=0; i<al.size(); i++)
			avg = avg + al.get(i).getMark();
		avg = avg / nosubjects;
		
		return avg;
	}
	
	public String toString()
	{
		return super.toString();
	}
}