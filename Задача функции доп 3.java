/*
задача идентична задаче 7
*/

public class Main
{
  public static int perimeter(int a, int b, int c)
  {
      return a+b+c;
  }
    
    public static double area(int a, int b, int c)
    {
        int p = perimeter(a,b,c);
        
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    
  public static void main (String[]args)
  {
      //даны два треугольника со сторонами a1,b1,c1 И a2,b2,c2
    int a1=2;
    int b1=2;
    int c1=2;
    int a2=3;
    int b2=3;
    int c2=3;
    int sumP=perimeter(a1,b1,c1)+perimeter(a2,b2,c2);   
    double sumA=area(a1,b1,c1)+area(a2,b2,c2);   
     
    
    System.out.printf("сумма периметров = %d сумма площадей = %f", sumP, sumA);

  }

}
