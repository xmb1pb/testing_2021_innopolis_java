import java.util.Scanner;    //подключаем модуль Scanner для работы со вводом

public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);  //создаем объект in типа Scanner и указываем что считывание ввода будет производится из System.in
	    System.out.println("enter number in range 100-999:");  //выводит подсказку что потльзователю требуется ввести трехзначное число
	    int num = in.nextInt();  //получаем введенное целое число методом nextInt() 
	    in.close();  //закрываем ввод, он нам больше не нужен
	 
	 
	    int a = num /100;   //вычисляем а - количество сотен, b- десятков, c - единиц
	    int b = num /10 % 10;
	    int c = num % 10;
	    int sum = a+b+c;   //ситаем сумму цифр числа
	    int mul = a*b*c;    // и их произведение
	    System.out.printf("%d = 100 x %d + 10 x %d + 1 x %d \n", num,a,b,c); //классный форматированный вывод
	    System.out.printf("sum = %d, multiply = %d", sum,mul);
	    
	}
}
