package javazensar.interfacedemo;

public class DyPatilCollege implements Universitydemo {

	@Override
	public void collegeName() {
		// TODO Auto-generated method stub
		System.out.println("D Y Patil Enginnering College");
	}

	@Override
	public void collegeType() {
		System.out.println("Enginnering College");
	}

	@Override
	public void collegeID() {
		System.out.println("PUNE-0004");
	}

	@Override
	public void numberOFTeachers() {
		// TODO Auto-generated method stub
		System.out.println("Total number of Teachers 50");
		
	}

	@Override
	public void numberOFStudent() {
		// TODO Auto-generated method stub
		System.out.println("Total number of student 500");
	}

	@Override
	public void CollegeDepartment() {
		// TODO Auto-generated method stub
		System.out.println("machnical, Computer, Civil");
	}
	
	public void machnicalDepartmentDetail()
	{
		System.out.println("Welcome to D Y patil machnical department ");
	}

}
