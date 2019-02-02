# Education_Management
Stores the details of students, professors and marks of a institutions.

Objective:
The objective of the assignment is to provide programming practice regarding class, objects,
constructors and Inheritance in Java.

Problem Statement:
Suppose that we are required to model students and professors in our Educational System
application. We can define a super class called Person to store common properties such as
name, age and address, and sub classes Student and Professor for their specific properties.
An object of type SubjectTaken is used to store a subject a student takes and mark obtained
by the student for that subject. For students, we need to maintain the subject taken and their
respective mark using the class SubjectTaken. Add a subject with mark, print all subject taken
and the average mark. A student takes at least 5 subjects. For professors, we need to maintain
2 subjects currently.

According to the requirements, implement the above classes. Write a Test driver class that does
the following things.
1. Create an array of 5 student objects with name, age and address.
2. Print the information of each student object.
3. Add 5 subjects with marks for each student.
4. Print out the marks of all subjects and the average mark of each student.
5. Create Professor object p with one of your professor’s name, age and address.
6. Print out the information of object p.
7. Set two subjects that the Professor p teaches.
8. Print out the subjects that Professor p teaches.

Hints: Use of ArrayList class in Java
The java.util.ArrayList class provides resizable array. In ArrayList, you can store any type
of objects which includes object of your user defined class.
Example:
SubjectTaken st1=new SubjectTaken(“ICP”,90);
SubjectTaken st2=new SubjectTaken(“DSA”,95);
........
ArrayList<SubjectTaken> list=new ArrayList<SubjectTaken>();
/*
If there is any compilation error in Eclipse IDE by writing the above line
click on the red cross mark in the left and
Change project compliance and
JRE to 1.5
*/
list.add(st1);
list.add(st2);
........
/*
The add() method of ArrayList class is used for adding an object element to
the ArrayList.
Syntax:
add(object element)
*//*
For displaying the elements of ArrayList (Marks of all subjects of a student)
*/
for (int i=0;i<list.size();i++)
{
System.out.println(list.get(i).getMark());
}
/*
For finding the size of ArrayList we can use size() method.
The get() method of ArrayList class is used to get the element of a specified
position within the ArrayList.
Syntax:
get(int index)
*/
The specific code template is provided for this project (A package called “education”
containing Person class, Student class, Professor class, SubjectTaken class and Test class).
Create a java project named as “EducationalSystem” in Eclipse IDE and copy the “education”
folder in src folder of the project.
