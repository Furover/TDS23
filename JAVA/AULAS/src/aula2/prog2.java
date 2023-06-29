package aula2;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		System.out.println("Type the base of the triangle:");
		t1.base = read.nextDouble();
		System.out.println("Type the height of the triangle:");
		t1.height = read.nextDouble();
		System.out.println("The area of the triangle:");
		t1.showArea();
		
		System.out.println("Type the base of the 2nd triangle:");
		t2.base = read.nextDouble();
		System.out.println("Type the height of 2nd the triangle:");
		t2.height = read.nextDouble();
		System.out.println("The area of the 2nd triangle:");
		t2.showArea();
	}

}
