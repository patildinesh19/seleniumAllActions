package javazensar.prgrams;

import java.util.Scanner;

public class PrgramsOnNumber {

	public static void main(String[] args) {
		/*
		 * //even and odd number oddOrevennumber();
		 * 
		 * // prime number boolean fflage ; fflage = primenumber(); if(fflage ==true) {
		 * System.out.println("number is prime"); } else {
		 * System.out.println("number is not prime");
		 * 
		 * }
		 * 
		 * //swap two numbers swapTwoNumbers();
		 * 
		 * 
		 * //fibbonofic serices fibbnoficsercies(); factorialOfNumber();
		 
		reverseTheNumber();
		findThenumberofDigits(); 
		sumationofalldigitfromnumber();*/
		checkNumberispalindrome();

	}

	public static void oddOrevennumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.print("number is Even :" + number);
		} else {
			System.out.print("number is Odd:" + number);
		}
	}

	public static boolean primenumber() {
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	public static void swapTwoNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int firstNumber = scanner.nextInt();
		System.out.print("Enter second number : ");
		int secondnumber = scanner.nextInt();

		int temp = 0;
		temp = firstNumber;
		firstNumber = secondnumber;
		secondnumber = temp;

		System.out.println("First number after swaped : " + firstNumber);
		System.out.println("Second number after swaped : " + secondnumber);
	}

	public static void fibbnoficsercies() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter fibbo number : ");
		int number = scanner.nextInt();
		int firstnumber = 0;
		int secondnumber = 1;
		int next;
		for (int i = 0; i <= number; i++) {
			System.out.println(firstnumber);
			next = firstnumber + secondnumber;
			firstnumber = secondnumber;
			secondnumber = next;
		}
	}

	public static void factorialOfNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Factorial number : ");
		int number = scanner.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);

	}

	public static void reverseTheNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter reverse number : ");
		int number = scanner.nextInt();
		int reverse = 0;
		int temp;
		while (number > 0) {
			System.out.println("****");
			temp = number % 10;
			System.out.println(temp);
			reverse = reverse * 10 + temp;
			System.out.println(reverse);

			number = number / 10;
			System.out.println(number);

		}
		System.out.println(reverse);
	}
	public static void findThenumberofDigits()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter reverse number : ");
		int number = scanner.nextInt();
		int count = 0;
		while(number>0)
		{
			number= number/10;
			count++;
		}
		System.out.println("Number of digit in number"+count);
	}
	
	public static void sumationofalldigitfromnumber()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number :");
		String stringNumber = scanner.nextLine();
		int number = Integer.parseInt(stringNumber);
		int temp =0;
		int sum = 0;
		while(number>0)
		{
			temp = number%10;
			sum = sum+temp;
			number = number/10;
		}
		System.out.println("Sumation of all number from "+sum);
	}
	
	public static void checkNumberispalindrome()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number in String Format: ");
		String numberString = scanner.nextLine();
		int number = Integer.parseInt(numberString);
		int reverse = 0;
		int r;
		while(number>0)
		{
			r= number%10;
			reverse = reverse *10+r;
			number = number/10;			
		}
		System.out.println(reverse);
		if(number==reverse)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("numberis not palindrome");
		}
	}
}