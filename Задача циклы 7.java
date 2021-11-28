/*
Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
1. сумму всех чисел последовательности;
2. количество всех чисел последовательности
*/
import java.util.Scanner;

public class Main
{
   

  public static void main (String[]args)
  {
	Scanner scan = new Scanner(System.in);
	int sum=0;
	int count=0; 
	int a=1;
	while(a!=0)
	{
	    
	System.out.println("Введите натуральное число. Для выхода введите 0.");
	a= scan.nextInt();
	if(a==0)
	{
	    break; 
	}
	count++;
	sum=sum+a;
	}
	
	System.out.println("Сумма всех чисел последовательности ="+sum);
	System.out.println("Количество чисел последовательности ="+count);
	
	  
  }

}
