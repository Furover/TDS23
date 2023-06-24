import java.util.Scanner;
import java.math.*;

public class exc3l2 {

	public static void main(String[] args) {
		Scanner nRead = new Scanner(System.in);
		System.out.println("\nInput the first number:");
		double n1 = nRead.nextInt();
		System.out.println("\nInput the second number:");
		double n2 = nRead.nextInt();
		System.out.println("\nInput the third number:");
		double n3 = nRead.nextInt();
		System.out.println("\nInput the fourth number:");
		double n4 = nRead.nextInt();
		double n1sqr = Math.pow(n1, 2);
		double n2sqr = Math.pow(n2, 2);
		double n3sqr = Math.pow(n3, 2);
		double n4sqr = Math.pow(n4, 2);

		if(n3sqr >= 1000)
		{
			System.out.printf("\nYes! The third number you input is higher or equal to 1000 when squared, the result being %.0f",n3sqr);
		}
		else
		{
			System.out.println("\nDamn! The third number you input didn't reach 1000 when squared, the result of each being:");
			System.out.printf("\n%.0f² = %.0f",n1,n1sqr);
			System.out.printf("\n%.0f² = %.0f",n2,n2sqr);
			System.out.printf("\n%.0f² = %.0f",n3,n3sqr);
			System.out.printf("\n%.0f² = %.0f",n4,n4sqr);


		}
		
		
	}

}
