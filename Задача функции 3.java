/*
Напечатать полную таблицу сложения в виде:
1 + 1 = 2 1 + 2 = 3 ... 1 + 9 = 10
2 + 1 = 3 2 + 2 = 4 ... 2 + 9 = 11
...
9 + 1 = 10 9 + 2 = 11 ... 9 + 9 = 18
*/


public class Main
{
  public static void printLine(int n)
  {
      for(int i=1; i<=9; i++)
      {
          System.out.print(n+" + "+i+" = "+(n+i)+"\t");
      }
  }

  public static void printTable(int rows)
  {
      for(int i =1; i<=rows; i++)
      {
         printLine(i);
         System.out.println();
      }
  }
  public static void main (String[]args)
  {
    printTable(9);

  }

}
