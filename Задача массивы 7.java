import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/*
Дан массив. Поменять местами:
1. второй и пятый элементы;
2. третий и максимальный элементы. Если элементов с максимальным значением
несколько, то в обмене должен участвовать первый из них.
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
    
    public static double arrayMax(double[] array)
    {
        
         double Max=array[0];
         for(int i=0; i<array.length;i++)
        {
             if (array[i]>Max){
                 Max=array[i];
             }
             
         }
         return Max;
    }
    
    public static double arrayMin(double[] array)
    {
         double Min=array[0];
         for(int i=0; i<array.length;i++)
         {
             if (array[i]<Min){
                 Min=array[i];
             }
             
         }
         return Min;
    }
    
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         double[] array = new double[20];
         array=randomArray(20);
         printArray(array);
         double Min=arrayMin(array);
         double Max=arrayMax(array);
         int MaxInd = maxInd(array, Max);
         
         double temp;
         
         temp=array[2];
         array[2]=array[5];
         array[5]=temp;
         printArray(array);
         temp=array[3];
         array[3]=array[MaxInd];
         array[MaxInd]=temp;
         printArray(array);
         
         
     }   
          
}