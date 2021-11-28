/*
Написать рекурсивную функцию для вычисления факториала натурального числа n
*/

public class Main
{
  public static int factorial(int n)
  {
    
    if (n == 1)
    {
        return 1;
    }
    
    else
    {
        return n * factorial(n - 1);
    }
    
  }
    

  
  public static void main (String[]args)
  {
    int n=3;   
    
    System.out.print(factorial(n));

  }

}
