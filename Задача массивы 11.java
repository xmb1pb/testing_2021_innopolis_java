import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/*
Дан двумерный массив.
1. поменять местами первую и третью строки
2. поменять местами второй и последний столбцы
*/
public class Main{
    
    public static double[][] enterMatrix(int n, int m)
    {
        Scanner sc=new Scanner(System.in);
        double[][] array;
        array=new double[n][m];
        for(int i =0; i<n; i++){
             for(int j=0; j<m;j++){
             System.out.printf("Введите %d элемент строки %d \n",j,i);
             array[i][j]=sc.nextDouble();  
         }
         }
         return array;
    }
    
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
         System.out.println();
         double temp;
         for (int i=0;i<=5;i++)    //1 and 3 rows
         {
             temp=matrix[0][i];
             matrix[0][i]=matrix[2][i];
             matrix[2][i]=temp;
              }
              printMatrix(matrix);
              System.out.println();
         
         for (int i=0;i<=5;i++) //поменять местами второй и последний столбцы
         {
             temp=matrix[i][1];
             matrix[i][1]=matrix[i][5];
             matrix[i][5]=temp;
         }
         printMatrix(matrix);
         System.out.println();

         
     }   
          
}