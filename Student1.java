package chapterThreeOne;

public class Student1 extends Person_1

{
	private double sGpa;
	private String sPass;
	private Assignment sCurrentAssignment;
	
	
	
	public Student1(String studentName, String studentBirthDate, double studentGpa, String studentPassword) 

	{
		super(studentName, studentBirthDate);
		sGpa = studentGpa;
		sPass = studentPassword;
		
	
	}
	
	

	public void printAssignmentInfo()
	{
		if (sCurrentAssignment != null)    // --> That's why we have created setCurrentAssignment method so sCurrentAssignment is pointing to a variable assignment
		{
			System.out.println("Assignment name: " + sCurrentAssignment.getName() + " , " + "Program name: " + sCurrentAssignment.getClassName() + ", " + "Assignment Duedate: " + sCurrentAssignment.getAssignmentDueDate()) ;
		}
	}

	@Override
	public String toString() 
	{
		return getName() + " " + sGpa + " " + sCurrentAssignment.getName();
	}
	
//	public Assignment getCurrentAssignment() {
//		return sCurrentAssignment;
//	}



	public void setCurrentAssignment(Assignment assignment)   
	{
		sCurrentAssignment = assignment;	// This is done so the sCurrentAssignment is not pointing to null reference.
	}  
	
	
	@Override
	public void printinfo() 
	{
		System.out.println("See, I'm a student now, with GPA: " +sGpa);
		
	}
	
	
	public double getsGpa() 
	{
		return sGpa; 
	}


	public void setsGpa(double sGpa, String password) 
	
	{
		if(password.equals(sPass))
		{
			this.sGpa = sGpa;
		}
		else
			System.out.println("You have entered an incorrect password");
	}


}
