package chapterThreeOne;

public class StudentTeacher extends Teacher 
{
	String mTeacherSchoolName;
	
	public StudentTeacher(String tname, String tbirthDate, double tsalary, int tnumOfYears, String teacherSchoolName) 
	{
		super(tname, tbirthDate, tsalary, tnumOfYears);
		mTeacherSchoolName = teacherSchoolName;
	}

//	@Override
//	public double getsalary()   	// --> the final modifier is used to prevent the variable from being overwritten. 
//	{								// --> In other words, there should not be any security vulnerabilities. 
//		return super.getsalary() + 40000 ;
//		
//	}
//	
	

}
	