/*
Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для
значений 1, 2, ..., 10 фунтов (1 фунт = 453 г)
*/


public class Main
{
  
public static String pounds(int pound)
{
    String t="";
    if (pound==1)
    {
        t="фунт";
    }
    if ((pound>=2)&(pound<5))
    {
        t="фунта";
    }
    if ((pound>=5)&(pound<=10))
    {
        t="фунтов";
    }
    return t;
} 

  public static void main (String[]args)
  {
    for(int i=1; i<=10; i++)
    {
        int kg=(i*453)/1000;
        System.out.println(i+" "+pounds(i)+" = "+kg+","+(i*453)+" кг");
    }
	
  }

}
