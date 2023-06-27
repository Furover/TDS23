package lista2;
import java.util.Scanner;

public class exc7l2 {

	public static void main(String[] args) {
		Scanner tRead = new Scanner(System.in);
		System.out.println("\nWhat's the triagle's height size?");
		int h = tRead.nextInt();
		System.out.println("\nWhat's the triagle's base size?");
		int b = tRead.nextInt();
		if(b > 0 && h > 0)
		{
			int a = (b * h) / 2;
			System.out.printf("\nThe area of the triangle is %d",a);
		}
		else
		{
			System.out.println("\nI'm sorry, but something went wrong :(");
		}
		
	}

}
