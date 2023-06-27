package lista3;
import java.util.Scanner;

public class exc3l3 {

	public static void main(String[] args) {
		int x = 0;
		double xAvg = 0;
		int xSum = 0;
		while(x >= 0){
			Scanner xRead = new Scanner(System.in);
			System.out.println("Typu da numba!!!");
			x = xRead.nextInt();
			if(x > 0){
			xSum += x;
			xAvg++;
			}
			
		}
		xAvg = xSum / xAvg;
		System.out.printf("\nThe average value of the numbers you typed where %.2f and their sum was %d",xAvg,xSum);
	}

}
