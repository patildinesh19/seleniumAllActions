package javazensar.interfacedemo;

public class Main {
	
	public static void main(String[] args) 
	{	
		String college=null;
	
					if(college.contains("m"))
					{
						Universitydemo un = new ModernCollege();
						
					}
					else
					{
					Universitydemo un = new DyPatilCollege();
					
					}
					
			
	
	}

		/* can not create object for interface */
		//Universitydemo un = new Universitydemo();
		
		/* we can create references for Interface and object for implemented class */
		
		
		

}
