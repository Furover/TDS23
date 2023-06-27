package lista2;
import java.util.Scanner;

public class exc6l2 {

	public static void main(String[] args) {
		Scanner aRead = new Scanner(System.in);
		System.out.println("\nWhat's the swimmer's age?");
		int age = aRead.nextInt();
		
		if(age >= 5 && age <= 7)
		{
			System.out.println("\nThe swimmer is in the category infantile A.");
		}
		else if(age <= 11)
		{
			System.out.println("\nThe swimmer is in the category infantile B.");
		}
		else if(age <= 13)
		{
			System.out.println("\nThe swimmer is in the category juvenile A.");
		}
		else if(age <= 17)
		{
			System.out.println("\nThe swimmer is in the category juvenile B.");
		}
		else if(age >= 18)
		{
			System.out.println("\nThe swimmer is in the adult category.");
		}
		else
		{
			System.out.println("\nI'm sorry, but something went wrong :(");
		}
		
	}
	
}


