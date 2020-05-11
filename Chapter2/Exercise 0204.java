/*Write a program that reads an integer between 0 and 1000 and adds the sum of all the digits in the integer.*/

import java.util.Scanner;

public class Exercise0204 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		int sum;
		System.out.print("Enter a number between 0 and 1000:");

		number = keyboard.nextInt();
		sum = 0;
		sum += number % 10;
		number = number / 10;
		sum += number % 10;
		number = number /10;
		sum += number % 10;
		System.out.print("The sum of the digits is " + sum + ".");
	}
}