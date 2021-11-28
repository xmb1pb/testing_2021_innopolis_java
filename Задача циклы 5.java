/*
Даны натуральное число n и вещественные числа a1, a2, ..., an.
Определить среднее арифметическое вещественных чисел
*/
import java.util.Scanner;

public class Main
{
   

  public static void main (String[]args)
  {
	System.out.println("Введите натуральное число n");
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	double sum=0;
	double a;
	for(int i=1; i<=n; i++)
	{
	System.out.println("Введите вещественное число число a"+i);
	a = scan.nextDouble();
	sum=sum+a;
	}
	double ave=sum/n;
	
	
	System.out.println("Среднее арифметическое введенных чисел = "+ave);
  }

}
