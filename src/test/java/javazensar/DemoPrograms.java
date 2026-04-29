package javazensar;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DemoPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(false);
		Date now = new Date();
		System.out.println(now);
		
		// Strings are immutable 
		
		String name = "Dinesh Patil"+"!!";
		System.out.println(name);
		name.replace("!","$");
		System.out.println(name);
		System.out.println(name.replace("!","$"));
		
		int[] numbers = new int [4];
		numbers[0] = 1;
		numbers[1] = 5;
		System.out.println(Arrays.toString(numbers));
		
		int[] numberforemp = {100,1010,1020,4056,98,34};
		Arrays.sort(numberforemp);
		System.out.println(Arrays.toString(numberforemp));
		
		int [][] numberstwwodimantions = new int [2][2];
		
		numberstwwodimantions[0][0] = 55;
		numberstwwodimantions[1][1] =66;
		
		System.out.println(Arrays.deepToString(numberstwwodimantions));
		
		// post increment
		
		int x= 1;
		int y= x++; // here x value assign  to y first then X will increment by 1
		System.out.println("x="+x);
		System.out.println("Y="+y);
		
		int a= 1;
		int b= ++a; // here a vale increment first then assign to b
		System.out.println("a="+a);
		System.out.println("B="+b);
		
		// Implicit casting 
		
		// byte > short > int > long > flot > double
		
		double X1 = 10.10;
		double Y1 = X1 + 2; // here 2 will implicitly casting to double 
		System.out.println("Y1 = "+Y1);
		
		// Explicit casting
			double X2 = 20.20;
			int Y2 = (int) (X2 + 40);
			System.out.println("Y2: "+Y2);
			
			// converting String to Integer using Integer Wrapper class
			
			String Salary = "50000";
			int PF =5000;
			int EmpSalary = Integer.parseInt(Salary);
			
			int NetTotalSalary = EmpSalary +PF;
			System.out.println("Employee Salary is "+NetTotalSalary);
			
			// number format  abstract class
			
			NumberFormat Currency = NumberFormat.getCurrencyInstance();
			String currency = Currency.format(198765.56676);
			System.out.println(currency);
			
			NumberFormat percentage = NumberFormat.getPercentInstance();
			String result = percentage.format(0.5566);
			System.out.println(result);
			
			// user Input
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Age:");
			Byte Age = scanner.nextByte();
			System.out.println("My Age is :"+Age);
			
			System.out.print("Enter your Name");
			String Name = scanner.next();
			System.out.println("My name is :"+Name);
			
			System.out.print("Enter your Full name :");
			String Fullname = scanner.nextLine();
			System.out.println("Full name is :"+Fullname);	
			
	      
			
			

			
		
		}
	

}
