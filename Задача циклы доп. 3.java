/*
Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для
значений 1, 2, ..., 10 фунтов (1 фунт = 453 г)
*/


public class Main
{
   

  public static void main (String[]args)
  {
    for(int i=1; i<=10; i++)
    {
        int kg=(i*453)/1000;
        System.out.println(i+" фунт = "+kg+","+(i*453)+" кг");
    }
	
  }

}
