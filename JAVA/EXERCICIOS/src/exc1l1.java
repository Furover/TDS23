import java.util.Scanner;


public class exc1l1 {

	public static void main(String[] args) {
		Scanner timeRead = new Scanner(System.in);
		System.out.println("\nWhat's the duration of the event in seconds?");
		int timeS = timeRead.nextInt();
		int timeM = timeS / 60;
		int timeH = timeM / 60;
		System.out.printf("\nThe duration of the event in hours is %dh, in minutes is %dmin and in seconds %ds",timeH,timeM,timeS);

		
	}

}
