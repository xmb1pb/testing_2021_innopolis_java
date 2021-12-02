import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/*
 Дан массив. Определить:
1. количество максимальных элементов в массиве;
2. количество минимальных элементов в массиве
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
    
    public static void printArray(double[] array)
    {
        for(int i =0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void printIntArray(int[] array)
    {
        for(int i =0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void printIntArrayReverse(int[] array)
    {
        for(int i =array.length-1; i>=0; i--)
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
         double[] array={5,6,-10,7,10,3,-4,9,10,-10};
         printArray(array);
         int countMin=0;
         int countMax=0;
         for(int i=0; i<10;i++)
         {
             if (array[i]==arrayMax(array)){
             countMax++;
             }
             if (array[i]==arrayMin(array)){
             countMin++;
             }
         }
         System.out.println("Максимальных элементов: "+countMax);
         System.out.println("Минимальных элементов: "+countMin);
         
         
         
         
     }   
          
}