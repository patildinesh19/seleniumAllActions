package javazensar.abstractdemo;

public class HondaDemo extends TwoWheelerDemo {

	public HondaDemo(String Type,String TWOWHEELERTYPE) {
		super( Type,TWOWHEELERTYPE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String vechicalBrand() {
		System.out.println("it is Upper class Brand");
		return null;
	}

	@Override
	public String vechicalStart() {
		System.out.println("it is auto start");
		return null;
	}

	@Override
	public void twoWheelertype() {
		System.out.println("it is Geare two Wheeler ");
	}
	

}
