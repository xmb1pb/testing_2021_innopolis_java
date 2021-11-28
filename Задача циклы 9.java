/*
Имеется фрагмент программы в виде оператора цикла с параметром, обеспечивающий
вывод на экран "столбиком" всех целых чисел от 10 до 30. Оформить этот фрагмент в виде:
1. оператора цикла с предусловием;
2. оператора цикла с постусловием.
*/
import java.util.Scanner;

public class Main
{
   

  public static void main (String[]args)
  {
	int i=10;
	while(i<=30)
	{
	    System.out.println(i);
	    i=i+2;
	}
	
	i=10;
	System.out.println("******");
	do
	{
	System.out.println(i);
	    i=i+2;    
	}
	while(i<=30);

  }

}
