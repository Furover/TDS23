package aula1;
import java.util.Scanner;
import java.math.*;

public class HelloWorld
{
	public static void main(String[] args)
	{
		/*
		//First command ever!!! (more like third, but who cares?)
		int y = 10;
		int x = 10;
		System.out.println("Hello World!");
		System.out.println("\nGamer test: "+(x + y)+"\n");
		char letter = 'S';
		String name = "slcmeu";
		boolean test = false;
		double value = 15.059193872875;
		
		
		 %s - string
		 %d - int
		 %.2f - double
		 
		 
		
		//Variable tests
		System.out.println(x);
		System.out.println(letter);
		System.out.println(name);
		System.out.println(test);
		System.out.println(y);
		System.out.printf("\nChanged value %.2f",value);
		System.out.printf("\nHello %s your wage is %.0f",name,value);

		
		//Scanner test
		int birthDay;
		Scanner read = new Scanner(System.in);
		System.out.println("\nEnter your name:");
		String RealName = read.nextLine();
		System.out.println("\nEnter your birth date:");
		birthDay = read.nextInt();
		birthDay = 2023 - birthDay;
		System.out.printf("\nYour name is %s and you are approximaly %d years old ",RealName,birthDay);
		if(RealName == "slc")
		{
			System.out.println("\nVariable test.");
		}
		else
		{
			System.out.println("\nTesting else.");
		}
		
		double v = Math.pow(2.00, 2.00)
		System.out.println(v)
		*/
		//Scanner test 2
		double temp;
		Scanner read = new Scanner(System.in);
		System.out.println("\nEnter your name:");
		String RealName = read.nextLine();
		System.out.println("\nEnter the temperature in Celsius:");
		temp = read.nextInt();
		temp = (temp * 1.8) + 32;
		System.out.printf("\nYour name is %s and the temperature is approximately %.0f°F ",RealName,temp);
		
	}
	public static void skip()
	{
		System.out.println();
	}
	
}
