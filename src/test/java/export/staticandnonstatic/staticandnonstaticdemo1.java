package export.staticandnonstatic;

public class staticandnonstaticdemo1

{	
	//global non static variables
	int i=2; 
	String name="Dinesh";
	//global static variables
	public static String surname="Patil";
	public static int g=9; 
	
	public static void printname() 
	{
		
		System.out.println("surnmame+name"+surname);
	}
		
	public void addnumbers()
	{
		int sum =i+g;
		System.out.println(sum);
	}
	
	public static void main(String arg [])
	{
		
	}
}
