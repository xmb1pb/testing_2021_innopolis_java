/*
Вычислить сумму 1+1/2+1/3+...+1/n.
*/
import java.util.Scanner;

public class Main
{
  

  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите n>0:");
    double n=sc.nextDouble();
    double sum=0;
    for(double i=1; i<=n; i++)
    {
        sum=sum+(1/i);
        
    }
	System.out.println("Сумма 1/1..1/n = "+sum);
  }

}
