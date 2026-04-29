package javazensar.abstractdemo;

public abstract class VehicalDemo {
	
	public String type;
	public String brand;
	public String start;
	
	public VehicalDemo(String TYPE)
	{
		this.type =TYPE;
	}
	
	public abstract String vechicalBrand();
	
	public abstract String vechicalStart();
	
	
}
