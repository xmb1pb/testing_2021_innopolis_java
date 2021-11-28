import java.util.Scanner;
/*
Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
*/
public class Main

{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter circle radius:");
	    int radius = in.nextInt();
	    System.out.println("Enter square side:");
	    int side = in.nextInt(); 
	    in.close();
	    
	    double circle=(Math.PI*Math.pow(radius,2))/2;
	    double square=Math.pow(side,2);
	    
	    if (circle<square){
	        System.out.print("circle S smaller than square S");
	    }
	        else if (circle>square){
	                System.out.print("circle S bigger than square S");
	        }
	        
	    else{
	        System.out.print("circle S and square S are equal");
	    }
	    
	    
	   	}
	    
	}

