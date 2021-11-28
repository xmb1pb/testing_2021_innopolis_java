/*
Последовательность Фибоначчи образуется так: первый и второй члены
последовательности равны 1, каждый следующий равен сумме двух предыдущих (1, 1, 2, 3, 5,
8, 13, ...). Дано натуральное число n.
1. Найти k-й член последовательности Фибоначчи.
2. Получить первые n членов последовательности Фибоначчи.
Решить задачу с помощью рекурсивных функций.
*/


public class Main
{
  public static int nextFibo(int fib1, int fib2)
  {
      int fib3=fib1+fib2;
      return fib3;
  }

  public static void printFibo(int elems)
  {
      int f1=1;
      int f2=1;
      int f3=0;
      System.out.printf("%d %d ", f1,f2);
      for(int i =3; i<=elems; i++)
      {
         f3=nextFibo(f1,f2);
         System.out.printf(f3+" ");
         f1=f2;
         f2=f3;
      }
  }
  public static void main (String[]args)
  {
    int n =20;   //печатаем первые 20 элементов последовательности
    printFibo(n);

  }

}
