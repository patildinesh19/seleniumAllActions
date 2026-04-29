package javazensar.abstractdemo;

public class Main {

	public static void main(String[] args) {
		
		/* we can not create object for Abstract class */
		//VehicalDemo v1 = new VehicalDemo();
		//TwoWheelerDemo t1 = new TwoWheelerDemo();
		
		/* can create object for child class where all abstract methods are implemented
		 * we can create references of Abstract class and object of implemented class*/
		HondaDemo h1 = new HondaDemo("TwoWheeler","Geare Type");
		VehicalDemo v2 = new HondaDemo("TwoWheeler","n0n Geare Type");
		
		h1.twoWheelertype();
		h1.vechicalBrand();
		h1.vechicalStart();
		
	}

}
