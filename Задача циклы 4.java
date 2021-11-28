/*
Найти:
1. сумму всех целых чисел от 100 до 500;
2. сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).
*/
import java.util.Scanner;

public class Main
{
   

  public static void main (String[]args)
  {
	int sum=0;  
	for (int i =100; i<=500; i++)
	{
		sum=sum+i;
	}  
	System.out.println("Сумма чисел от 100 до 500 = "+sum);
	
    Scanner scan = new Scanner(System.in);
	int a;
	int b;
	do
	{
	   System.out.println("Введите число a:");
	   a = scan.nextInt();
	   System.out.println("Введите число b больше или равное a:");
	   b = scan.nextInt();
	   	   
	
	if(a>b)
	{
	    System.out.println("Вы ввели числа неверно.");
	}    
	}
	
	while(a>b);
	sum=0;
	for(int j=a; j<=b; j++)
	{
		sum=sum+j;
	}
	System.out.println("Сумма чисел от "+a+" до "+b+" = "+sum);
  }

}
