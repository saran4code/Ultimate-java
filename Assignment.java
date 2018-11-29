package chapterThreeOne;

import java.util.Date;

public class Assignment 
{

	private String sName, sClassName;
	private Date sAssignmentDueDate;
	
	public Assignment(String name, String className, Date assignmentDueDate) 
	
	{
		sName = name;
		sClassName = className;
		sAssignmentDueDate = assignmentDueDate;
				
	}
	
	public Assignment getClosestAssignment(Assignment[] assignments)
	{
		long date = 0;
		Assignment closestAssignment = null;
		
		for (Assignment assignment : assignments) 
		
		{
			if (assignment.sAssignmentDueDate.getTime() < date)
			{
				date = assignment.sAssignmentDueDate.getTime();
				closestAssignment = assignment;
			}
							
		}
		
		return closestAssignment;
	}

	public String getName() {
		return sName;
	}

	public void setName(String sName) {
		this.sName = sName;
	}

	public String getClassName() {
		return sClassName;
	}

	public void setClassName(String sClassName) {
		this.sClassName = sClassName;
	}

	public Date getAssignmentDueDate() {
		return sAssignmentDueDate;
	}

	public void setsAssignmentDueDate(Date sAssignmentDueDate) {
		this.sAssignmentDueDate = sAssignmentDueDate;
	}
	
	

}
