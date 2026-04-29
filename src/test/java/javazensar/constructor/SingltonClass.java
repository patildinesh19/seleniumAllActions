package javazensar.constructor;

public class SingltonClass {
	private static SingltonClass instance;
	private SingltonClass()
	{
		System.out.println("Singalton instance is created");
	}
	
	public static SingltonClass getinstance()
	{
		if(instance==null)
		{
			instance = new SingltonClass();
		}
		return instance;
		
	}

}
