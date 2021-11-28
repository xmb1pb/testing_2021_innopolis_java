/*
Последовательность Фибоначчи образуется так: первый и второй члены
последовательности равны 1, каждый следующий равен сумме двух предыдущих (1, 1, 2, 3, 5,
8, 13, ...). Дано натуральное число n.
1. Найти k-й член последовательности Фибоначчи.
2. Получить первые n членов последовательности Фибоначчи.
Решить задачу с помощью рекурсивных функций.
*/
import java.util.Scanner;

public class Main
{
  public static int fibonacci(int n)
  {
      if(n==0)
      {
          return 1;
      }
      if(n==1)
      {
      return 1;
      }
      else
{
    return fibonacci(n-1)+fibonacci(n-2);
}
  }

  
  
  public static void main (String[]args)
  {
  int k=5;//k-й член последовательности
System.out.println(fibonacci(k));
System.out.println("************");


    int n =20;   //печатаем первые 20 элементов последовательности
    for (int i=1; i<=n;i++)
    {
        System.out.print(fibonacci(i)+" ");
    }

  }

}
