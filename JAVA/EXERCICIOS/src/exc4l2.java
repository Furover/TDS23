import java.util.Scanner;

public class exc4l2 {

	public static void main(String[] args) {
		Scanner nRead = new Scanner(System.in);
		System.out.println("\nInput a number:");
		int n = nRead.nextInt();
		
		if(n % 2 == 0)
		{
			System.out.printf("\nThe number %d is even and",n);
		}
		else
		{
			System.out.printf("\nThe number %d is odd and",n);
		}
		if(n < 0)
		{
			System.out.println(" negative.");
		}
		else
		{
			System.out.println(" positive.");
		}
		
	}

}
