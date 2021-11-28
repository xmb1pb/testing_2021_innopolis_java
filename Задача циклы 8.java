/*
Дано натуральное число. Определить:
1. количество цифр 3 в нем;
2. сколько раз в нем встречается последняя цифра;
3. количество четных цифр в нем;
4. сумму его цифр, больших пяти;
5. произведение его цифр, больших семи;
6. сколько раз в нем встречаются цифры 0 и 5 (всего).
*/
import java.util.Scanner;

public class Main
{
   

  public static void main (String[]args)
  {
	Scanner scan = new Scanner(System.in);
	
	int current_digit; 
	int last_digit_count=0;
	int evens_count=0;
	int sum_bigger_than_5=0;
	int mul_bigger_tan_7=1;
	int count_3=0;
	int count_0_and_5=0;
	System.out.println("введите целое число:");
	int num = scan.nextInt();
	int last_digit=num%10;   //берем последнюю цифру числа
	
	while(num>0)
	{
	    current_digit=num%10;       //берем циферку скраю
	    if (current_digit==last_digit)
	    {
	        last_digit_count++;   //считаем сколько раз встречется последняя цифра
	    }
	    if(current_digit==3)
	    {
	        count_3++;        //считаем 3
	    }
	    if((current_digit==0)|(current_digit==5))
	    {
	        count_0_and_5++;  //считаем 0 и 5
	    }
	    if(current_digit%2==0)
	    {
	        evens_count++;   //считаем четные
	    }
	    if (current_digit>5)
	    {
	        sum_bigger_than_5=sum_bigger_than_5+current_digit;  //считаем сумму цифр больших 5
	    }
	    if(current_digit>7)
	    {
	        mul_bigger_tan_7=mul_bigger_tan_7*current_digit;    //считаем произведение цифр больших 7
	   
	    }
	    num=num/10;  //отрезаем от числа циферку
	}
	
	System.out.println("последняя цифра числа встречается в нем "+last_digit_count+" раз");
	System.out.println("четных цифр в числе: "+evens_count);
	System.out.println("сумма цифр больших 5: "+sum_bigger_than_5);
	System.out.println("произведение цифр больших 7: "+mul_bigger_tan_7);   //не совсем верно, пишет 1 даже если в числе нет семерок 
	System.out.println("3 встречается в числе "+count_3+" раз");
	System.out.println("0 и 5 встречаются в числе "+count_0_and_5+" раз");
	

  }

}
