/*
Дано натуральное число.
1. Определить его максимальную цифру
2. Определить его минимальную цифру.
*/
import java.util.Scanner;

public class Main
{
   

  public static void main (String[]args)
  {
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите целое число: ");
	int n=scan.nextInt();
	int min_digit=n%10; //пусть минимальная и максимальная цифра для начала будут равны последней цифре, потом посмотрим
	int max_digit=n%10;
	int current_digit;
	while(n>0)
	{
	    current_digit=n%10;
	    if(max_digit<current_digit)
	    {
	        max_digit=current_digit;
	    }
	    if(min_digit>current_digit)
	    {
	        min_digit=current_digit;
	    }
	    n=n/10;
	}
	System.out.println("Максимальная цифра: "+max_digit);
	
	System.out.println("Минимальная цифра: "+min_digit);
  }

}
