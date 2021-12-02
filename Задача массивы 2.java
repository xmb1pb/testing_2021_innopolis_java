import java.util.Scanner;
import java.util.Random;
/*
Используя датчик случайных чисел, заполнить массив из двадцати элементов
неповторяющимися числами. Вывести полученные массивы на экран
*/
public class Main{
    
    public static void printArray(int[] array)
    {
        for(int i =0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         Random r = new Random();
         int[] array;
         array=new int[20];
         for(int i =0; i<20; i++){
             array[i]=r.nextInt(99);
         }
         printArray(array);
          }
}