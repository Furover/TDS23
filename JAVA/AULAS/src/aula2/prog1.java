package aula2;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double base, height, area;
		System.out.println("Type the base of the triangle:");
		base = read.nextDouble();
		System.out.println("Type the height of the triangle:");
		height = read.nextDouble();
		System.out.println("The area of the triangle:");
		area = (base * height) / 2;
		System.out.println(area);
		double base2, height2, area2;
		System.out.println("Type the base of the 2nd triangle:");
		base2 = read.nextDouble();
		System.out.println("Type the height of 2nd the triangle:");
		height2 = read.nextDouble();
		System.out.println("The area of the 2nd triangle:");
		area2 = (base * height) / 2;
		System.out.println(area);
		if(area > area2) {
			System.out.println("The first triangle had a bigger area.");
		}
		else if(area == area2) {
			System.out.println("Both triangles had the same area.");
		}
		else {
			System.out.println("The second triangle had a bigger area.");
		}
	}

}
