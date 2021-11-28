/*
Составить программу вывода любого числа любое заданное число раз.
*/
import java.util.Scanner;

public class Main
{
   

  public static void main (String[]args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите любое число:");
      double x = sc.nextDouble();
      System.out.println("Введите целое количество итераций:");
      int n = sc.nextInt();
      
    for(int i=1; i<=n; i++)
    {
        System.out.println(x);
    }
	
  }

}
