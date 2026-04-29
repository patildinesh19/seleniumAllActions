package javazensar.interfacedemo;

public class ModernCollege implements Universitydemo {

	@Override
	public void collegeName() {
		// TODO Auto-generated method stub
		System.out.println("D Y Patil Enginnering College");
	}

	@Override
	public void collegeType() {
		System.out.println("Graduation College");
	}

	@Override
	public void collegeID() {
		System.out.println("PUNE-0066");
	}

	@Override
	public void numberOFTeachers() {
		// TODO Auto-generated method stub
		System.out.println("Total number of Teachers 30");
		
	}

	@Override
	public void numberOFStudent() {
		// TODO Auto-generated method stub
		System.out.println("Total number of student 200");
	}

	@Override
	public void CollegeDepartment() {
		// TODO Auto-generated method stub
		System.out.println("Match,IT,Commers,Arts");
	}

	public void mathDepartmentDetails()
	{
		System.out.println("Welcome to Match Department of Modern College");
	}
}
