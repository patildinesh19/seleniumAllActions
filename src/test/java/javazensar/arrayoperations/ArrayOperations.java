package javazensar.arrayoperations;

import javazensar.constructor.Employee;

public class ArrayOperations {

	public static void main(String[] args) {
		
		/* Primitive Array -- it store value in int, double, string, char, boolean
		 * it store actual values
		 * default values are 0, 0.000, Null, false*/
		
		String [] empname = new String [3];
		System.out.println(empname);
		System.out.println("Default value of Primitive String array is :"+empname[0]);
		
		int [] numbers = new int[3];
		System.out.println(numbers);
		System.out.println("Default value for Primitive Integre array is "+numbers[1]);
		
		empname[0]="Dinesh";
		empname[1]="Mangesh";
		
		numbers[2]=55;
		numbers[0]=66;
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		for(int i=0;i<empname.length;i++)
		{
			System.out.println(empname[i]);
		}
		
		/* User Define Array --- it store object class instance
		 * it store object memory allocation / references under array index*/
		
		Employee [] emparray = new Employee[3];
		System.out.println(emparray);
		System.out.println(emparray[0]);
		
		emparray[0] = new Employee(0005, "Priyanka", 90000, 37, "Teacher", "English Teacher");
		emparray[2] = new Employee(0006, "Prabhvati", 500000, 65, "HouseWife", "English Teacher");
		System.out.println(emparray[0]);
		
		for(int i=0;i<emparray.length;i++)
		{
			System.out.println(emparray[i]);
		}
		
		
	}

}
