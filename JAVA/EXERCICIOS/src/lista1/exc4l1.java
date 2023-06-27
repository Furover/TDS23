package lista1;
import java.util.Scanner;

public class exc4l1 {

	public static void main(String[] args) {
		Scanner nRead = new Scanner(System.in);
		System.out.println("\nInput the first number:");
		double a = nRead.nextInt();
		System.out.println("\nInput the second number:");
		double b = nRead.nextInt();
		System.out.println("\nInput the third number:");
		double c = nRead.nextInt();
		System.out.println("\nInput the fourth number:");
		double d = nRead.nextInt();
		System.out.println("\nInput the fifth number:");
		double e = nRead.nextInt();
		System.out.println("\nInput the sixth number:");
		double f = nRead.nextInt();
		double x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		double y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		System.out.printf("The result of x is %.2f and y is %.2f",x,y);


	}

}