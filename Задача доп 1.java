import java.util.Scanner;
/*
В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0, за ничью — 1.
Известно количество очков, полученных командой за игру. Определить словесный результат
игры (выигрыш, проигрыш или ничья).
*/
public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter points (3 or 1 or 0):");
	    int points = in.nextInt();
	    in.close();
	    System.out.print("The game result is ");
	    
	    switch(points){
	        case(3):
	            System.out.print("WIN");
	            break;
	        case(0):
	            System.out.print("LOSE");
	            break;
	        case(1):
	            System.out.print("TIE");
	            break;
	       
	    }
	     
	    
	}
}