package lista2;
import java.util.Scanner;

public class exc5l2 {

	public static void main(String[] args) {
		Scanner polRead = new Scanner(System.in);
		System.out.println("\nWhat's the pollution index?");
		double polInd = polRead.nextDouble();
		if(polInd >= 0.05 && polInd <= 0.25)
		{
			System.out.println("\nEverything seems to be normal! No action required.");
		}
		else if(polInd > 0.25 && polInd < 0.3)
		{
			System.out.println("\nThings are getting kinda frisky, but no action required.");
		}
		else if(polInd >= 0.3 && polInd < 0.4)
		{
			System.out.println("\nHigh levels of pollution reached! Group 1 needs to stop their activities.");
		}
		else if(polInd >= 0.4 && polInd < 0.5)
		{
			System.out.println("\nReally high levels of pollution reached! Groups 1 and 2 need to stop their activities.");
		}
		else if(polInd >= 0.5)
		{
			System.out.println("\nMax levels of pollution reached! All groups need to stop their activities.");
		}
		else
		{
			System.out.println("\nI'm sorry, but something went wrong :(");
		}
		
	}

}
