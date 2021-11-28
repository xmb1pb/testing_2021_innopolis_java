import java.util.Scanner;
/*
Дано натуральное число. Определить:
1. является ли оно четным;
2. оканчивается ли оно цифрой 7
*/
public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number:");
	    int num = in.nextInt();
	    in.close();
	    
	    boolean iseven = num%2==0;
	    boolean endwith7 = num%10==7;
	    
	    System.out.print("Entered number "+num+" ");
	    if (iseven){
	        System.out.print("is even ");
	    }
	    else
	    {
	        System.out.print("is odd");
	    }
	    if (endwith7){
	        System.out.print(" and ends with 7");
	    }
	    else
	    {
	        System.out.print("and NOT ends with 7");
	    }
	        
	    }
	    
	  

