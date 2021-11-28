import java.util.Scanner;
/*
Дано двузначное число. Определить:
1. Является ли сумма его цифр двузначным числом
2. Больше ли числа а сумма его цифр
*/
public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number in range 10-99:");
	    int a = in.nextInt();
	    in.close();
	    System.out.println("a = "+a);
	    
	    int a10=a/10;
	    int a1=a%10;
	    int sum = a1+a10;
	    
	    if ((sum>=10)&(sum<=100)){
	        System.out.println("сумма цифр а двузначное число" );
	        }
	        else{
	            System.out.println("сумма цифр а не двузначное число");
	        }
	    if (sum>a){
	        System.out.println("сумма цифр а больше а");
	    }
	    else{
	        System.out.println("сумма цифр а не больше а");
	    }
	   	}
	    
	}
