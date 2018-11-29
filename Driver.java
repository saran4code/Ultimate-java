package chapterThreeOne;

import java.util.Calendar;
import java.util.Date;

public class Driver 

{
	public static void main(String[] args) 
	
	{
//		Student student1 = new Student("Saran", "20th July 1988");
//		student1.printinfo();
//		
//		Teacher teacher1 = new Teacher("Sudha", "19th July 1965");
//		teacher1.printinfo();
//		
//		Student1 student2 = new Student1("Saran", "20th July 1988", "4.0", "pass1");
//		student2.printinfo();
//		student2.setsGpa("5.0", "incorrect_pass");
//		System.out.println(student2.getsGpa());
//		
//		Person_1 person = new Person_1("Sam", "New year's eve");
//		person.printinfo();
//		
//		Person_1[] personArray = 
//			{
//					new Student1("Kamal","Diwali","7.0","passw"),
//					new Teacher("Kala", "27th August 1975")
//										
//			};
//		
		Date dueDate = new Date();
		Assignment saranAssignment = new Assignment("Java Programming", "BigData", dueDate);
		Student1 Saran = new Student1("Saran", "20th July, 1988", 4.0, "pass1");
		Saran.setCurrentAssignment(saranAssignment);
		Saran.printAssignmentInfo();
		System.out.println(Saran);
		
		
		Teacher sally = new Teacher("Sally", "4th August 1965", 5000, 10);
		System.out.println(sally.getsalary());
		
		StudentTeacher Mikey = new StudentTeacher("Mikey", "20th July 1988", 20000, 1, "Davis");
		System.out.println(Mikey.getsalary());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1980);
		calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.DATE, 23);
		
		
		Principal principal = new Principal("Kumar", "23/06/1960", calendar.getTime());
		doSomething(sally);
		doSomething(principal);
		doSomething(Mikey);
		
		sally.doSomething();
				
	}
		
		public static void doSomething(Person_1 person) 
		
			{
		
		
			if (person instanceof Student1)
			{
				System.out.println("This is a student");
			}
			else if (person instanceof Teacher)
			{	Teacher castedTeacher = (Teacher) person;
// Syntax for downcasting  -  Sub-class casted<Sub-class> = (Sub-class) object/parameter that is being passed
				System.out.println("This person is a teacher and drawing a salary of " + castedTeacher.getsalary());
																			// we are calling getsalary() method of the castedClass.
			}
			
			
				 
	}
			
}
	



	
