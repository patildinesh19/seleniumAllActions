package javazensar.inheritanceoperations;

import javazensar.constructor.Employee;

public class Main {

	public static void main(String[] args) {
		//parent object only access parent methods.
		Employee e1 = new Employee();
		
		// we can create references for parent class and object for child class and it is also know as upcasting 
		Employee e2 = new QADepartment(01,"Sager", "Manual");
		
			
		/* using parent reference and child object we can not access method of child class
		e2.getqaTeamsize();*/
		
		/* not allow to create reference of child class and object for parent class
		QADepartment e3 = new Employee(); */		
		
		/* create a child class object and access both parent and child methods and static variable and static methods*/
		
		QADepartment qae1 = new QADepartment(01,"Dinesh", "Manual");
		System.out.println(qae1);
		QADepartment qae2 = new QADepartment(02,"Amoal", "Automation");
		System.out.println(qae2);
		qae1.getQaTeamsize();
		qae1.getEmName();
		qae1.calculateSalary(90000,5000,6000);
	
		//method Overriding calling child method 
		e2.calculateSalary(100000, 2000, 6000);
		
		// calling parent and child constructor
		QADepartment qe3 = new QADepartment(00010,"Ankit Patil",100000, 44, "QA","Testing",005, "Ankit", "Manul", "Manasi");
		System.out.println(qe3);
		System.out.println(qe3.getEmpID());
		System.out.println(qe3.getEmName());
		System.out.println(qe3.getEmpSalary());;
		qe3.calculateSalary(200000, 5000);
		
		qe3.calculateSalary(200000, 5000, 10000);	
		
		qe3.getWorkDetail();
	}

}
