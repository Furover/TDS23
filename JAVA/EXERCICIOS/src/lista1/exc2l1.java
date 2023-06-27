package lista1;
import java.util.Scanner;
import java.math.*;

public class exc2l1 {

	public static void main(String[] args) {
		Scanner nRead = new Scanner(System.in);
		System.out.println("\nInput the first number:");
		double n1 = nRead.nextInt();
		System.out.println("\nInput the second number:");
		double n2 = nRead.nextInt();
		System.out.println("\nInput the third number:");
		double n3 = nRead.nextInt();
		double v1 = Math.pow(n1 + n2, 2);
		double v2 = Math.pow(n2 + n3, 2);
		double v3 = (v1 + v2) / 2;
		System.out.printf("The result is %.2f ",v3);
		
		}

}
