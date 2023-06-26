import java.util.Scanner;
public class teste {
    public static void main(String[] args){
        try (Scanner test = new Scanner(System.in)) {
                System.out.println("Hello again world!... please say something");
                String rtest = test.nextLine();
                if(rtest.equals(""))
                {
                    System.out.println("Ok then... you don't have to say anything, I know you're there :)");
                }
                else
                {
                    System.out.println("Hey thanks!, I've been alone for so long, I just needed to hear something :)");
                }
        }

    }
    
}
