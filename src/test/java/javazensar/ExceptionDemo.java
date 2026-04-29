package javazensar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {
		

	public static void shown() {
		// TODO Auto-generated method stub
		sayHellow(null);
	}
	
	public static void sayHellow(String name)
	{
		try {
		System.out.println(name.toUpperCase());
		}
		catch(NullPointerException e) {
			System.out.println("String is not aviliable"+e.getMessage());
			
		}
		
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\TestData\\readexcelfile.csv");
			System.out.println("File found");
		} catch (FileNotFoundException e) {
			System.out.println("File not present on given location"+e.getMessage());
			
		}
		System.out.println("Read File data start");
	}

}
