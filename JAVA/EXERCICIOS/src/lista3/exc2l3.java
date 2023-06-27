package lista3;

public class exc2l3 {

	public static void main(String[] args){
		int sum = 0;
		jump(1);
		lines(30);
		System.out.println("\nWhat's the sum of every number between 1-500\nThat is divisible by 3 and odd?");
		lines(30);
		jump(1);
		for(int x = 1; x <= 500; x++) {
			if(x % 3 == 0 && x  % 2 != 0){
				sum += x;
			}
		}
		System.out.printf("\n\n... and the answer is: %d!!!!!",sum);
	}
	public static void lines(int size){
		for(int z = 1; z <= size; z++){
		System.out.print("-");
		}
	}
	public static void jump(int size){
		for(int z = 1; z <= size; z++){
		System.out.print("-");
		}
	}
}
