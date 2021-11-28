/*Напечатать числа в виде следующей таблицы:
5 5 5 5 5 5
5 5 5 5 5 5
5 5 5 5 5 5
5 5 5 5 5 5
*/
public class Main
{
  // обьявляем функцию которая принимает количество столбцов, строк, символ и печатает матрицу
  
  public static void printTable (int cols, int rows, String symbol)
  {
    for (int l = 1; l <= rows; l++)  //цикл идет от 1 до заданого значения строк матрицы
      {

	for (int i = 1; i <= cols; i++)  //цикл идет от 1 до заданого значения столбцов матрицы
	  {
	    System.out.print (symbol + " ");
	  }
	System.out.println ();
      }
  }

  public static void main (String[]args)
  {
    printTable (5, 4, "5");  //вызываем функцию печати матрицы и передаем ей параметры

  }

}
