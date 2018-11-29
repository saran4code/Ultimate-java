package chapterThreeOne;

import java.util.Date;

public class Principal extends Person_1
{
	private Date mJoinDate; 	// The date when the principal joined
	

	public Principal(String personName, String personBirthDate, Date joinDate) {
		super(personName, personBirthDate);
		mJoinDate = joinDate;
		
	}
	

}
