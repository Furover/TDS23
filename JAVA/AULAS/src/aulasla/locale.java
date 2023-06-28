package aulasla;
import java.util.Locale;
import java.util.Scanner;

public class locale {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ITALY);
		Scanner tRead = new Scanner(System.in);
		double test = 0.00;
		test = tRead.nextDouble();
		System.out.println("Not formatted: " + test);
		System.out.printf("Formatted: %.6f", test);
		System.out.println( ((test % 2) == 0) ? "\nnumber is even!" : "\nnumber is odd!" );
		
		
	}

}
