import java.util.Scanner;  //подключаем Scanner
/*
Известны площади круга и квадрата. Определить:
1. уместится ли круг в квадрате?
2. уместится ли квадрат в круге?
*/
public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);     //открываем scanner для ввода
	    System.out.println("Enter circle S:");
	    int circle = in.nextInt();                      //вводим площадь круга
	    System.out.println("Enter square S:");
	    int square = in.nextInt();                   //площадь квадрата
	    in.close();                             //закрываем scanner
	    
	    double square_siagonal = Math.sqrt(2*square);     //вычисляем диагональ квадрата
	    double square_side =Math.sqrt(square);                     //сторону квадрата
	    double circle_diameter = 2*Math.sqrt(circle/Math.PI);        //диаметр круга
	    
		//круг уместится в квадрате если диаметр круга меньше либо равен стороне квадрата 
		
	    if (circle_diameter<=square_side){
	        System.out.printf("circle with S %s will fit square with S %s", circle,square);
	    }
	    else
	    {
	        System.out.printf("circle with S %s will NOT fit square with S %s", circle,square);
	    }
	    
		System.out.println("and");
		
		//квадрат уместится в круге если диагональ квадрата меньше или равна диаметру круга
	    if (square_siagonal<=circle_diameter){
	        System.out.printf("square with S %s will fit circle with S %s", square, circle);
	    }
	    else
	    {
	        System.out.printf("square with S %s will NOT fit circle with S %s", square, circle);
	    }
	        
	    }
	    
	  
	    
	}

