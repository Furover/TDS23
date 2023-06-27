package lista3;

public class exc5l3 {

	public static void main(String[] args){
		int x = 233;
		do{
			if(x >= 300 && x <= 400){
				x += 3;
				System.out.println(x);
			}
			else{
				if(x + 5 > 456) {
					break;
				}
				else {
					x += 5;
					System.out.println(x);
				}
			}
		}
		while(x <= 456);
	}
	

}
