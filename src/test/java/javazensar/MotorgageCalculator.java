package javazensar;

import java.text.NumberFormat;
import java.util.Scanner;

public class MotorgageCalculator {
	
	public static void main (String args[])
	{
		
		final byte month_In_Year=12;
		final byte percentage = 100;
		int principle_Amount;
		float anualInterestRate;
		float monthalyInterestRate;
		int numberOfPayment;
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			
			System.out.print("Enter Principle Amount :");
			principle_Amount = scanner.nextInt();
			if(principle_Amount>= 10000 && principle_Amount<=10000000)
				break;
			System.out.println("Enter valid Principle amount between 10k to 1 CR");
		}
		
		while(true)
		{
			System.out.print("Enter Annual intrest rate :");
			anualInterestRate = scanner.nextFloat();
			if(anualInterestRate >=0 && anualInterestRate<=30)
			{
				monthalyInterestRate = anualInterestRate/ percentage/month_In_Year;
				break;				
			}
			System.out.println("Enter Valid Intreset rate between 0 to 30 ");		
			
		}
		
		while(true)
		{
			System.out.print("Enter No of Year (Period): ");
			byte noOfYear = scanner.nextByte();
			if(noOfYear >=5 && noOfYear<=30 )
			{
				numberOfPayment = noOfYear*month_In_Year;
				break;
			}
			System.out.println("Enter valid no of year between 5 to 30");
		}
			
		double Mortgage  = principle_Amount
				* (monthalyInterestRate * Math.pow(1+monthalyInterestRate, numberOfPayment))
				/ (Math.pow(1+monthalyInterestRate, numberOfPayment)-1);
		String MortgageFormated = NumberFormat.getCurrencyInstance().format(Mortgage);
		System.out.println("Mortgage :"+MortgageFormated);
	}

}
