package export.Inheritance;



public class CreateProfile extends coomanclass 
{
	
	public CreateProfile() 
	{
		
		super();
		System.out.println("I am child constructor");
	}

	public static void main (String str[])
	{
	
		
//	coomanclass c=new coomanclass();
		
// created refrance of parent class and created object of child class  child class object can access both methods and variables
	coomanclass v=new CreateProfile();
	v.Addmember();
	v.login();
	v.loguot();
	
	
	// we can access variables and methods of class coomanclass
	
	/*c.Addmember(); // this will access method of coomanclass class and it will not acess child class methods or variables
	c.login();
	c.loguot();
	String abc=c.FullName;
	System.out.println("print string abc"+abc);
	int i=c.A;
	System.out.println("Print Integer"+i); */
//	CreateProfile ff = new CreateProfile();
	//ff.Addmember(); //this will access method of CreateProfile class
	
	
	
}
	public void Addmember()
	{
		super.Addmember(); // this will call parent method Addmember() when we want invoke both methods at same time
		System.out.println("Child member added sucessfully");
		//this.deletemember(); //we can call and execute same class method inside the same class method 
		
	}
	public void deletemember()
	{
		System.out.println("member deleted sucessfully cc");
		
	}
	
}
