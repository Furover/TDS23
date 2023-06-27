package lista2;
import java.util.Scanner;

public class exc2l2 {

	public static void main(String[] args) {
		Scanner cRead = new Scanner(System.in);
		System.out.println("\nWhat's the employee's code?");
		String code = cRead.nextLine();
		System.out.println("\nHow many hours has he worked this month?");
		int wHours = cRead.nextInt();
		int excess;
		int salary;
		if(wHours <= 50 && wHours > 0)
		{
			excess = 0;
			salary = wHours * 10;
			System.out.printf("\nThe employee %s has worked %d overtime hours, and will be payed %d this month, %d being from overtime work.",code,excess,salary,(excess * 20));

		}
		else if(wHours > 50)
		{
			excess = wHours - 50;
			wHours -= excess;
			salary = wHours * 10;
			System.out.printf("\nThe employee %s has worked %d overtime hour(s), and will be payed $ %d this month, $ %d being from overtime work.",code,excess,(salary + (excess * 20)),(excess * 20));

		}
		else
		{
			System.out.println("\nI'm sorry but I can't run these numbers :( ");

		}
	}

}
