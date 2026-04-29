package javazensar.constructor;

public class Employee {
	
	private int empID;
	private String emName;
	private double empSalary;
	private int empAge;
	private String empDepartment;
	private String empWork;
	public static int employeecount;
	
	static
	{
		employeecount=0;
	}
	public Employee()
	{
		empID=00000;
		emName = "Unkonw";
		
		
	}
	
	public Employee(int EMPID, String EMPNAME, double EMPSALARY , int EMPAGE, String EMPDEPART, String EMPWORK)
	{
		this.empID=EMPID;
		this.emName=EMPNAME;
		this.empSalary=EMPSALARY;
		this.empAge = EMPAGE;
		this.empDepartment=EMPDEPART;
		this.empWork=EMPWORK;
		++employeecount;
		
	}
	
	// constructor overloading
	
	public Employee(String EMPNAME, int EMPID,  double EMPSALARY , int EMPAGE, String EMPDEPART, String EMPWORK)
	{
		this.empID=EMPID;
		this.emName=EMPNAME;
		this.empSalary=EMPSALARY;
		this.empAge = EMPAGE;
		this.empDepartment=EMPDEPART;
		this.empWork=EMPWORK;
		
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmName() {
		return emName;
	}
	public void setEmName(String emName) {
		this.emName = emName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpWork() {
		
		return empWork;
	}
	public void setEmpWork(String empWork) {
		
		this.empWork = empWork;
	}
	
	// To String method overloaded from Object class
	
	public String toString() {
	    return "Employee [empID=" + empID + 
	           ", emName=" + emName + 
	           ", empSalary=" + empSalary + 
	           ", empAge=" + empAge + 
	           ", empDepartment=" + empDepartment + 
	           ", empWork=" + empWork + "]";
	}
	
	
	// Method Overloading for own class
	
	// calculate base salary only
	public double calculateSalary(double basesalary)
	{
		System.out.println("Base Salary is : "+basesalary);
		return basesalary;		
	}
	//calculate with bonus salary
	public double calculateSalary(double basesalary, float orgBonus)
	{
		double salaryWithBonus = basesalary+orgBonus;
		System.out.println("Salary with Bonus is : "+salaryWithBonus);
		return salaryWithBonus;
	}
	
	// calculate salary with allowances
	public double calculateSalary(double basesalary, float orgBonus, int orgAllowances)
	{
		double salaryWithInsentives = basesalary+orgBonus+orgAllowances;
		System.out.println("Salary with Insnentives :"+salaryWithInsentives);
		return salaryWithInsentives;
	}
	
	//Access Static Variable using Static method
	public static int numberOfEmployee()
	{
		System.out.println("Total number of Employee is "+employeecount);
		return employeecount ;
	}
	
	/*Abstract method, when we make abstract method then class should be Abstract 
	 * once class is abstract then can not create object for class.
	public abstract void getWorkDetail(); */
	
	
	
}
