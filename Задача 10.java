import java.util.Scanner;
/*
Составить программу, которая в зависимости от порядкового номера дня недели (1, 2, ..., 7)
выводит на экран его название (понедельник, вторник, ..., воскресенье).
*/
public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of day:");
	    int dayn = in.nextInt();   //вводим число от 1 до 7 с клавиатуры и запиываем в перменную days
	    in.close();
	    System.out.print(" The day is ");
	    
	    switch(dayn){     //смотрим какое значение у нас записано в days
	        case(1):       //и в случае если там 1 выводим "понеледьник"
	            System.out.print("monday");
	            break;
	        case(2):     //если 2 то "вторник"
	            System.out.print("tuesday");
	            break;
	        case(3):
	            System.out.print("wednesday");
	            break;
	        case(4):
	            System.out.print("thursday");
	            break;
	        case(5):
	            System.out.print("friday");
	            break;
	        case(6):
	            System.out.print("saturday");
	            break;
	        case(7):              //и т д
	            System.out.print("sunday");
	            break;
	    }
	     
	    
	}
}