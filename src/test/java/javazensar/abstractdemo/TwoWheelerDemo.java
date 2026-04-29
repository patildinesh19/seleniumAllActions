package javazensar.abstractdemo;

public abstract class TwoWheelerDemo extends VehicalDemo {

	private String twoWheelertpe;
	public TwoWheelerDemo(String TYPE, String TWOWHEELERTYPE) {
		super(TYPE);
		this.twoWheelertpe = TWOWHEELERTYPE;
		// TODO Auto-generated constructor stub
	}
	
	public abstract void twoWheelertype();
	
}
