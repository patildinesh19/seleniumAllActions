package export.staticandnonstatic;

public class staticdemo2 extends staticandnonstaticdemo1
{
	public static void main (String str [])
	{
		System.out.println(surname); // static variable not required object of parent class
		printname(); //static method not required object of parent class using static we reduce the space 
		
		staticdemo2 st=new staticdemo2();
		st.addnumbers();
		// for non static methods or variables required object of class
		int f=st.i;
		System.out.println(st.name);
		System.out.println(f);
		
		
		
		
	}
}
