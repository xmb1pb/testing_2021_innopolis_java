import java.util.Scanner;
/*
4
Даны три вещественных числа a, b, c. Проверить:
1. выполняется ли неравенство a < b < c;
2. выполняется ли неравенство b > a > c.
*/
public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("a:");
	    int a = in.nextInt();
	    System.out.println("b:");
	    int b = in.nextInt();
	    System.out.println("c:");
	    int c = in.nextInt();
	    in.close();
	    System.out.printf("a = %d b = %d c = %d \n", a,b,c);
	    
	    System.out.println("выполняется ли неравенство a < b < c");
	    
	    
	    if ((a<b)&(b<c)){
	        System.out.println("да" );
	        }
	        else{
	            System.out.println("нет");
	        }
	     System.out.println("выполняется ли неравенство  b > a > c");
	    
	    if ((b>a)&(a>c)){
	        System.out.println("да");
	    }
	    else{
	        System.out.println("нет");
	    }
	   	}
	    
	}