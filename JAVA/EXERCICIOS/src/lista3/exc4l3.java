package lista3;

import java.util.Scanner;

public class exc4l3 {

	public static void main(String[] args) {
		int x = 0;
		Scanner xRead = new Scanner(System.in);
		System.out.println("Typu da numba!!!");
		x = xRead.nextInt();
		System.out.println("\n"+x);
		while(x <= 100) {
			x *= 3;
			System.out.println(x);
		}
	}

}
