/*
Гражданин 1 марта открыл счет в банке, вложив 1000 руб. Через каждый месяц размер
вклада увеличивается на 2% от имеющейся суммы. Определить:
1. за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
2. через сколько месяцев размер вклада превысит 1200 руб.
*/

public class Main
{
   

  public static void main (String[]args)
  {
      double income=0;
      double account=1000;
      int monthCount=0;
      int m1=0;
      int m2=0;
	
	while(income<30)
	{
	    income=account*0.02;
	    account=account+income;
	    monthCount++;
	    if (income>30)
	    {
	        m1=monthCount;
	    }
	}
	   monthCount=0;
	   account=1000;
	while(account<=1200)
	{
	    income=account*0.02;
	    account=account+income;
	    monthCount++;
	   
	    if (account>=1200)
	    {
	        m2=monthCount;
	    } 
	    
	}
	
	
	System.out.println("величина ежемесячного увеличения вклада превысит 30 руб через "+m1+" месяцев");
	System.out.println("размер вклада превысит 1200 руб через "+m2+" месяцев");
	
  }

}
