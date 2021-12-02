import java.util.Scanner;
import java.util.Random;
/*
Дан массив. Напечатать:
1. все неотрицательные элементы
2. все элементы, не превышающие число 100
*/
public class Main{
    
    public static void printArray(double[] array)
    {
        for(int i =0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    public static double[] randomArray(int n)
    {
         Random r = new Random();
         double[] array;
         array=new double[n];
         for(int i =0; i<n; i++){
             array[i]=r.nextInt(99);  
         }
         return array;
    }
    
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         double[] array = new double[20];
         array=randomArray(20);
         printArray(array);
         int l = array.length;
         
         for(int i=0; i<l;i++)
         {
             if (array[i]>=20){
                 System.out.print(array[i]+" ");
             }
             
         }
         System.out.println();
         
         
         for(int j=0; j<l;j++)
         {
            if (array[j]<=100){
                 System.out.print(array[j]+" ");
            }
            
         }
         System.out.println();
          }
}