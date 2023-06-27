package lista2;
import java.util.Scanner;

public class exc8l2 {

	public static void main(String[] args) {
		Scanner nRead = new Scanner(System.in);
		System.out.println("\nType a number!");
		int n = nRead.nextInt();
		if(n > 100)
		{
			System.out.printf("\nThat's right baby! The number you typed(%d) is higher than 100!",n);
		}
		else
		{
			System.out.println("\nNah man, ya gotta type a number higher than 100!");
		}
		
		
	}

}
