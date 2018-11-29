package chapterThreeOne;

public class Teacher extends Person_1 

{
	double mBaseSalary;
	int mNumOfYears;
	
	
	public Teacher(String tname, String tbirthDate, double tsalary, int tnumOfYears) 
	{
		super(tname, tbirthDate);
		mBaseSalary = tsalary;
		mNumOfYears = tnumOfYears;
		
	}
		
	public final double getsalary() 
	
	{
		return mBaseSalary * mNumOfYears + 10000;
		
	}

	@Override
	public void doSomething() {
		System.out.println("This is a teacher who is drawing a salaray " + getsalary());
		super.doSomething();
	}
	
	
}
