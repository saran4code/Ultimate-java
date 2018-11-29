package chapterThreeOne;

public class Person_1 {
	
	private String mname, mbirthDate;
	
	
	public String getName() {
		return mname;
	}



	public void setMname(String mname) {
		this.mname = mname;
	}



	public String getMbirthDate() {
		return mbirthDate;
	}



	public void setMbirthDate(String mbirthDate) {
		this.mbirthDate = mbirthDate;
	}



	public Person_1(String personName, String personBirthDate)
	{
		mname = personName;
		mbirthDate = personBirthDate;
	}
	
	
	
	public void printinfo() {
		System.out.println("I am a Person and I was born on " + mbirthDate);
	}
	
	
	public void doSomething() {
		
	}

}
