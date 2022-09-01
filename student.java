package manyOne;

public class student 
{
	private String name;
	private Integer age;
	private Integer standard;
	private Marks[] marks;
	
	
	public student(String name, Integer age, Integer standard, Marks[] marks) 
	{
		this.name = name;
		this.age = age;
		this.standard = standard;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("***************Student Details***************");
		System.out.println("Name        ::"+name);
		System.out.println("Age         ::"+age);
		System.out.println("Standard    ::"+standard);
		System.out.println("****************Student Marks****************");
		for (Marks mark:marks) 
		{
			System.out.println();
			System.out.println("Subject ::"+mark.getSubject());
			System.out.println("Mark    ::"+mark.getMark());
			
		}
		
	}
	
	
	

}
