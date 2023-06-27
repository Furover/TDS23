package lista3;
import java.util.Scanner;

public class exc1l3 {

	public static void main(String[] args) {
		int sons = 0;
		double salary = 0;
		double medSalary = 0;
		double medSons = 0;
		double totSalary = 0;
		double perSalary = 0;
		double hiSalary = 0;
		int totSons = 0;
		Scanner pRead = new Scanner(System.in);
		System.out.println("Tell me, how many people are being interviewed?");
		int people = pRead.nextInt();
		for(int x = 1; x <= people; x++){
			System.out.println("What's your salary?");
			salary = pRead.nextInt();
			System.out.println("How many kids do you have?");
			sons = pRead.nextInt();
			totSalary += salary;
			totSons += sons;
			if(salary <= 100) {
				perSalary++;
			}
			if(salary > hiSalary) {
				hiSalary = salary;
			}
			
			
		}
		medSalary = totSalary / people;
		medSons = totSons / people;
		perSalary = (perSalary / people) * 100;
		System.out.printf("The average salary is $ %.2f, the average amount of kids is %.2f",medSalary,medSons);
		System.out.printf("\nHighest salary was $ %.2f but the percentage of people with salaries up to $ 100 was %.2f%",hiSalary,perSalary);
	}

}
