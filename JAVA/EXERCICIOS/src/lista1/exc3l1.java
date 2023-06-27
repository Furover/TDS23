package lista1;
import java.util.Scanner;
import java.math.*;

public class exc3l1 {

	public static void main(String[] args) {
		Scanner gRead = new Scanner(System.in);
		System.out.println("\nInput the first grade:");
		double g1 = gRead.nextInt();
		System.out.println("\nInput the second grade:");
		double g2 = gRead.nextInt();
		System.out.println("\nInput the third grade:");
		double g3 = gRead.nextInt();
		double fg = (g1 * 0.2) + (g2 * 0.3) + (g3 * 0.5);
		System.out.printf("The total grade of this student is %.2f ",fg);
		
		}

}
