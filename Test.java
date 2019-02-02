package education;
import java.util.Scanner;
public class Test 
{
	public static void main(String[] args) 
	{
		String name=null,address=null,subject=null;
		int age=0,mark=0;
		Scanner sc=new Scanner(System.in);
		Student s[]=new Student[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("\nEnter the name of the Student "+ (i+1) +">>> ");
			name = sc.nextLine();
			System.out.print("Enter the address of the Student "+ (i+1) +">>> ");
			address = sc.nextLine();
			System.out.print("Enter the age of the Student "+ (i+1) +">>> ");
			age = Integer.parseInt(sc.nextLine());
			s[i] = new Student(name, address, age);
			
			for(int j=0;j<5;j++)
			{
				System.out.print("\nEnter the " + (j+1) + "th subject of the Student "+ (i+1) +">>> ");
				subject = sc.nextLine();
				System.out.print("Enter the mark " + "in " + subject + " >>> ");
				mark = Integer.parseInt(sc.nextLine());
				s[i].addSubjectMark(subject,mark);
			}
		}
		System.out.println();
		
		System.out.println("Student Information");
		System.out.println("******************");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("\nStudent " + (i+1) + ">>>\n");
			System.out.println("Name   : " + s[i].getName());
			System.out.println("Address: " + s[i].getAddress());
			System.out.println("Age    : " + s[i].getAge());
			System.out.println("\nResult Card>>>");
			System.out.println("All Subject >>> Marks>>> ");
			s[i].printMarks();
			System.out.println();
			System.out.println("Average of all five subjects>>> " + s[i].getAverageMarks());
			System.out.println("\n");
		}
		
		String course = null,subject1 = null,subject2 = null;
		System.out.println("Professor Information");
		System.out.println("******************");
		
		System.out.print("\nEnter the name of the Professor: ");
		name = sc.nextLine();
		System.out.print("Enter the course of the Professor: ");
		course = sc.nextLine();
		System.out.print("Enter the age of the Professor: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("\nEnter the 1st subject of the Professor: ");
		subject1 = sc.nextLine();
		System.out.print("Enter the 2nd subject of the Professor: ");
		subject2 = sc.nextLine();
		Professor p = new Professor(name,course,age);
		
		System.out.println("Professor Name  : " + p.getName()); 
		System.out.println("          Course: " + p.getAddress()); 
		System.out.println("          Age   : " + p.getAge()); 
		p.setSubject1(subject1);
		p.setSubject2(subject2);
		System.out.println("Subjects professor teaches >>>");
		System.out.println(p.getSubject1() + "\n" + p.getSubject2());
	}

}