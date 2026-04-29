package javazensar;

import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		// Switch statement
			Scanner scanner = new Scanner(System.in);
					System.out.print("Enter yor Role : ");
					String role = scanner.nextLine();
					
					switch (role){
					
					case "Admin":
						System.out.println("Your role is Admin");
						break;
					case "QA":
						System.out.println("Your role is QA");
					case "DEV":
						System.out.println("YOur role is DEV");
						break;
					default:
						System.out.println("Your role is Guest");
					}

					  // Autoboxing converting primantive data type into object 
					
					int A = 300;
					System.out.println(A);
					Integer B = new Integer(A);
					System.out.println(B);
					// Autoboxing converting Object into primantive data type 
					Integer S = new Integer(100);
					System.out.println(S);
					int G= S;
					System.out.println(G);
					
	}

}
