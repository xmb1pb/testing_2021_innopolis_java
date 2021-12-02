import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/*
Дан двумерный массив.
1. Вывести на экран элемент, расположенный в правом верхнем углу массива
2. Вывести на экран элемент, расположенный в левом нижнем углу массива
*/
public class Main{
    
    
    public static double[][] randMatrix(int n)
    {
        Random r = new Random();
         double[][] array;
         array=new double[n][n];
         for(int i =0; i<n; i++){
             for(int j=0; j<n;j++){
             array[i][j]=r.nextInt(99);  
         }
         }
         return array;
    }
    public static void printMatrix(double[][] array)
    {
        for(int i =0; i<array.length; i++)
        {
            for(int j =0; j<array.length; j++)
        {
            System.out.print(array[i][j]+"\t");
        }
        
        System.out.println();
        }
    }
    
   
    
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         double[][] matrix = new double[6][6];
         matrix=randMatrix(6);
         printMatrix(matrix);
         
         System.out.println("Правый верхний: "+matrix[0][5]);
         System.out.println("Левый нижний: "+matrix[5][0]);

         
         
         
     }   
          
}