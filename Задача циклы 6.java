/*
Последовательность Фибоначчи образуется так: первый и второй члены
последовательности равны 1, каждый следующий равен сумме двух предыдущих (1, 1, 2, 3, 5,
8, 13, ...). Дано натуральное число n.
1. Найти k-й член последовательности Фибоначчи.
2. Получить первые n членов последовательности Фибоначчи.
3. Верно ли, что сумма первых n членов последовательности Фибоначчи есть четное число?
*/
import java.util.Scanner;

public class Main
{
   

  public static void main (String[]args)
  {
	System.out.println("Введите k");
	Scanner scan = new Scanner(System.in);
	int k= scan.nextInt();
	System.out.println("Введите n");
	int n= scan.nextInt();
	int fib1=1;
	int fib2=1;
	int fib3;
	int fibk=0;
	int counter;
	int sum=2;
	
	if (k>n)
	{
	    counter=k;
	}
	else
	{
	    counter=n;    
	}
	
	System.out.print("первые "+n+" членов последовательности: 1, 1, ");
	for(int i=1; i<=counter-2; i++)
	{
	fib3=fib1+fib2;
	if(i+2<=n)
	{
	sum=sum+fib3;
	}
	if (i+2==k)
	{
	    fibk=fib3;
	}
	fib1=fib2;
	fib2=fib3;
	System.out.print(fib3+", ");
	
	}
	System.out.println();
	
	if(sum%2==0)
	{
	System.out.println("Сумма "+n+" членов последовательности("+sum+") четное число");
	}
	else
	{
	System.out.println("Сумма "+n+" членов последовательности("+sum+") нечетное число");
	    
	}
  System.out.println("k-й член последовательности = "+fibk);
      
  }

}
