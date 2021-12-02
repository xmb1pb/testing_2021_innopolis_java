import java.util.Scanner;
import java.util.Random;
/*
Дан массив. Все его элементы:
1. увеличить в 2 раза
2. уменьшить на число А
3. разделить на первый элемент.
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
             array[i]=array[i]*2;
         }
         printArray(array);
         
         System.out.println("Введите число А:");
         double A = sc.nextDouble();
         for(int j=0; j<l;j++)
         {
             array[j]=array[j]-A;
         }
         printArray(array);
         double first=array[0];
         for(int i=0; i<l;i++)
         {
             array[i]=array[i]/first;
         }
         printArray(array);
         
          }
}