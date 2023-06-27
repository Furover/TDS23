package lista1;
import java.util.Scanner;

public class exc5l1 {

	public static void main(String[] args) {
		Scanner pRead = new Scanner(System.in);
		System.out.println("\nWhat's the price of the car?:");
		double price = pRead.nextInt();
		double totalp = (price * 1.73);
		System.out.printf("\nThe total price you'll pay with taxes is $ %.2f:",totalp);

	}

}
