import java.util.Scanner;
/*
Известен вес боксера-любителя. Известно, что вес таков, что боксер может быть отнесен к
одной из трех весовых категорий:
1. легкий вес — до 60 кг;
2. средний вес — до 75 кг;
3. тяжелый вес — до 91 кг;
4. супертяжелый вес – с 91 кг.
Определить, в какой категории будет выступать данный боксер
*/
public class Main

{
	public static void main(String[] args) {
		//блок ввода веса боксера  с клавиатуры
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter weight:");
	    int weight = in.nextInt();
	    in.close();  //закрываем ввод
		//печатаем введенный вес
	    System.out.printf("Your boxer weight is %d kg and his weight category is ", weight);
	    // блок ветвления
	    if (weight<75){                 //смотрим меньше или больше вес нашего боксера чем 75
	        if (weight<60){               //если меньше 75 то проверяем меньше ли он 60
	            System.out.print("1 - super light");   //tесли меньше 60 то суперлегкий
	        }
	        else{
	            System.out.print("2 - light");   //иначе легкий
	        }
	    }
	    else{     // если он таки больше 75   
	        if(weight<91){             //сотрим больше ли он 91
	            System.out.print("3 - heavy");    // если нет то тяжелый
	        }
	    
	        else{
	            System.out.print("4 - super heavy");  //иначе супертяж
	    }
	        }
	  
	    
	}
}