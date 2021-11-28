/*
Реализовать функцию нахождения минимума:
1. Из трёх чисел
2. Из четырёх чисел
*/

public class Main
{
  public static int Min(int a, int b)
  {
      if(a<b)
      {
          return a;
      }
      else return b;
  }
    
    public static int Min3(int a, int b, int c)
    {
        return Min(Min(a,b),c);
    }

    public static int Min4(int a, int b, int c, int d)
    {
        return Min(Min(a,b),Min(c,d));
    }
  
  public static void main (String[]args)
  {
    //даны 4 числа a b c d
    int a=2;   
    int b=3;   
    int c=4;   
    int d=1;   
    
    System.out.println(Min3(a,b,c));
    System.out.println(Min4(a,b,c,d));

  }

}
