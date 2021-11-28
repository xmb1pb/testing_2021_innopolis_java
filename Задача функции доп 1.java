/*
Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*".

*/

public class Main
{
  public static void drawStar()
  {
      for(int i=1; i<=10; i++)
      {
          System.out.print("*");
      }
  }
    
    
    
    
  public static void main (String[]args)
  {
      
    drawStar();
  }

}
