import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/*
Дан массив. Определить:
1. максимальный элемент
2. минимальный элемент
3. на сколько максимальный элемент больше минимального
4. индекс максимального элемента
5. индекс минимального элемента
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
    
     public static int minInd(double[] array, double Min)
    {
        int MinInd=0;
         for(int i =0; i<array.length; i++){
             if (array[i]==Min){
                 MinInd=i;
                 break;
             }  
         }
         return MinInd;
    }
    
    public static int maxInd(double[] array, double Max)
    {
        int MaxInd=0;
         for(int i =0; i<array.length; i++){
             if (array[i]==Max){
                 MaxInd=i;
                 break;
             }  
         }
         return MaxInd;
    }
    
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         double[] array = new double[20];
         array=randomArray(20);
         printArray(array);
         int l = array.length;
         double Min=array[0];
         double Max=array[0];
         for(int i=0; i<l;i++)
         {
             if (array[i]<Min){
                 Min=array[i];
             }
             if (array[i]>Max){
                 Max=array[i];
             }
             
         }
         System.out.println("максимальный элемент: "+Max);
         System.out.println("минимальный элемент: "+Min);
         double minmax=Max-Min;
         System.out.println("максимальный элемент больше минимального на "+minmax);
         System.out.println("индекс максимального элемента: "+minInd(array, Max));
         System.out.println("индекс минимального элемента: "+minInd(array, Min));


         
         
     }     
}