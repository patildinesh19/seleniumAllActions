package export.Constructordemo;

public class constructordemo {

	public constructordemo()
	{
		System.out.println("I am constructor");
	}
	
	public constructordemo(int i, int j) 
	{
		int C=i+j;
		
		System.out.println("I am parametrized constructor"+C);
	}

	public void generalfunction()
	{
		System.out.println("this is genreral function");
	}
	
	
	public static void main(String[] args)
	{
		constructordemo cd=new constructordemo();
		cd.generalfunction();//other than constructor we need to call method using object of class
		constructordemo pc=new constructordemo(3,4);
		
	}

}
