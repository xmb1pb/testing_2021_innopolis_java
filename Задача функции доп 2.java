/*
Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа
символов "*".

*/
import java.util.Scanner;

public class Main
{
  public static void drawStar(int n)
  {
      if(n<=0)
      {
          System.out.println();
      }
      else
      {
        for(int i=1; i<=n; i++)
      
        {
          System.out.print("*");
        }
      }
  }
    
    
    
    
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("введите количество звездочек: ");
    
    drawStar(sc.nextInt());
  }

}
