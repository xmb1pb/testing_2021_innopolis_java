import java.util.Scanner;
/*
Составить программу, которая уменьшает первое введенное число в два раза, если оно
больше второго введенного числа по абсолютной величине.
*/
public class Main

{
	public static void main(String[] args) {
		//блок ввода чисел с клавиатуры
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number 1:");
	    int num1 = in.nextInt();
	    System.out.println("Enter number 2:");
	    int num2 = in.nextInt();
	    in.close();
		//печатаем введенные числа
	    System.out.printf("Input is: %d and %d \n", num1, num2);
	    
		//сравниваем модули введенных чисел
	    if (Math.abs(num1)>Math.abs(num2)){     //Math.abd фкнеция стандартной библиотеки для вычисления модуля

	        num1=num1/2;                 
	    }
	    System.out.printf("Output is: %d and %d", num1,num2);  //вывод результата
	}
	  
	    
	}

