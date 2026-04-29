package javazensar.constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // default constructor implicit call for instance variable age, salary, department, work
		// default constructor is explicit call for empid and empname
		Employee e = new Employee();
		System.out.println(e);
		System.out.println(e.getEmpID());
		System.out.println(e.getEmName());
		System.out.println(e.getEmpAge());
		System.out.println(e.getEmpSalary());
		System.out.println(e.getEmpDepartment());
		System.out.println(e.getEmpWork());
		
		// Parameterize constructor
		Employee e2 = new Employee(0001,"Dinesh",250000.00,42,"QA","Test_Architecture");
		System.out.println(e2.getEmName());
		System.out.println(e2);
		
		//object is not created only reference is created so need to give default value
		Employee e3 = null;
		System.out.println(e3);
		//now object is not created and instance  is created so it will print memory allocation
		e3 = new Employee(0002,"Ganesh",400000.00,44,"Accoutant","Cashier");
		System.out.println(e3);
		
		
		
		//Singleton		
		SingltonClass s1 = SingltonClass.getinstance();
		SingltonClass s2 = SingltonClass.getinstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		
		// method Overloading and 
		//object will call which method it decided at before compiler so it is static binding
			Employee emp = new Employee();

	        System.out.println("Basic Salary: " + emp.calculateSalary(30000));

	        System.out.println("With Bonus: " + emp.calculateSalary(30000, 5000));

	        System.out.println("With Bonus + Allowance: " + emp.calculateSalary(30000, 5000, 2000));
	        
	   
	   // Access Static variable using static method call
	        Employee.numberOfEmployee();
	        Employee  e4 = new Employee(0005, "Priyanka", 90000, 37, "Teacher", "English Teacher");		
	        Employee  e5 = new Employee(0006, "Prabhvati", 500000, 65, "HouseWife", "English Teacher");	
			
			 Employee.numberOfEmployee();		
			}

}
