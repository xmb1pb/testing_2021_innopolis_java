/*
Напечатать числа в виде следующей таблицы:
1 2 ... 10
1 2 ... 10
1 2 ... 10
1 2 ... 10

*/
import java.util.Scanner;

public class Main
{
    
    public static void printLine()
    {
        for(int i=1; i<=10; i++)
        {
        System.out.print(i+" ");
        }
    }
    
  public static void printNums(int n)
  {
      if(n<=0)
      {
          System.out.println();
      }
      else
      {
        for(int i=1; i<=n; i++)
      
        {
          printLine();
          System.out.println();
        }
      }
  }
    
    
    
    
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("введите количество рядов: ");
    
    printNums(sc.nextInt());
  }

}
