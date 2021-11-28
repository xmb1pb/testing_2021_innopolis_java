/*Напечатать числа в виде следующей таблицы:
5
5 5
5 5 5
5 5 5 5
5 5 5 5 5
*/
public class Main
{
  // обьявляем функцию которая принимает  длину строки, символ и печатает строку
  
  public static void printLine (int len, String symbol)
  {
   for (int i=1; i<=len; i++){
	System.out.print (symbol);
   }
  }
//объявляем функцию которая принимает количество строк, символ, вызывает функцию печать строки и передает ей длину строки и символ
public static void printTable(int len, String symbol){
    for (int i=1; i<=len; i++){
        printLine(i, symbol);
        System.out.println();
    
    }
}

  public static void main (String[]args)
  {
    printTable (5, "5");  //вызываем функцию печати горки и передаем ей параметры

  }

}
