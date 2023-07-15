package apps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Erros {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int grades[] = new int[3];
		int position;
		
		grades[0] = 10;
		grades[1] = 5;
		grades[2] = 3;
		try {
		System.out.println("Type the position of the grade from 0 to 2: ");
		position = read.nextInt();
		System.out.println("The current grade is "+grades[position]);
		System.out.println("Type the new grade: ");
		grades[position] = read.nextInt();
		System.out.println("The new grade is "+grades[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error, type a number from 0 to 2!");
			
		}
		catch(InputMismatchException e) {
			System.out.println("Error, type a *number* from 0 to 2!");

		}
		finally {
			System.out.println("Check your code!!!");
		}
		System.out.println("End of the program!");
	}

}
