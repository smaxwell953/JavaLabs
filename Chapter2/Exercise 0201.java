/* Exercise 2.1. Write code that converts Fahrenheit to Celsius. The formula for conversion is: C = (5/9) * (F - 32). */ 

import java.util.Scanner;
public class ConvertCeltoFah
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double fahrenheit;
		fahrenheit = input.nextDouble();
		double celsius = ( (5 / 9) * (fahrenheit - 32));
		System.out.println("The temperature in Celsius is " + celsius);	
	}
}
