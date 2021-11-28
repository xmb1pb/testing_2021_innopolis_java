import java.util.Scanner;
/*
5
Даны два числа. Если квадратный корень из второго числа меньше первого числа, то увеличить
второе число в пять раз.
*/
public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("number 1:");
	    int a = in.nextInt();
	    System.out.println("number 2:");
	    int b = in.nextInt();
	    
	    in.close();
	    System.out.printf("input = %d %d \n", a,b);
	    
	    if (Math.sqrt(b)<a){
	        b=b*5;
	        }
	       
	     System.out.printf("out = %d %d", a,b);
	    
	    
	   	}
	    
	}
