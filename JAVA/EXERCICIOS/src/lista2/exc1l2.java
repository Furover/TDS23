package lista2;
import java.util.Scanner;

public class exc1l2 {

	public static void main(String[] args) {
		Scanner wRead = new Scanner(System.in);
		System.out.println("\nWhat's the weight of your tomatoes?");
		int weight = wRead.nextInt();
		int excess = weight - 50;
		int tax = excess * 4;
		if(weight <= 50 && weight > 0)
		{
			tax = 0;
			excess = 0;
			System.out.printf("\nCongrats! You have exceeded %dkg of the max weight allowed, so you will have to pay $ %d of tax",excess,tax);
		}
		else if(weight > 50)
		{
			System.out.printf("\nI'm sorry, but you have exceeded %dkg of the max weight allowed, so you will have to pay $ %d of tax",excess,tax);
		}
		else
		{
			System.out.println("\nI'm sorry, but you need to provide a valid input for me to calculate :(");
		}

	}

}
