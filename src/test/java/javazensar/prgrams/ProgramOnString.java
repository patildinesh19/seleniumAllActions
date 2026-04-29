package javazensar.prgrams;

import java.util.Scanner;

public class ProgramOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverseString();
		reverseTheWord();
	}

	public static void reverseString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String :");
		String string = scanner.nextLine();
		char ch;
		String str = "";

		for (int i = string.length() - 1; i >= 0; i--) {
			ch = string.charAt(i);
			str = str + ch;
		}
		System.out.println("Reverse String : " + str);
	}

	public static void reverseTheWord() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Word");
		String inputString = scanner.nextLine();
		String result = "";
		char ch;
		String reverseWord = "";
		String[] words = inputString.split(" ");

		for (String word : words) {

			System.out.println(word);

			for (int i = word.length() - 1; i >= 0; i--) {
				ch = word.charAt(i);
				reverseWord = reverseWord + ch;

			}
			System.out.println(reverseWord);
		}
		result = result + reverseWord + " ";

		System.out.println(result);

	}

}
