import java.util.Scanner;
import java.util.Random;
/*
Дан массив. Составить программу:
1. расчета квадратного корня из любого элемента массива;
2. расчета среднего арифметического двух любых элементов массива
Предусмотреть возможность ошибочных обращений вне границ массива
*/
public class Main{
    
    public static void printArray(int[] array)
    {
        for(int i =0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    public static int[] randomArray(int n)
    {
         Random r = new Random();
         int[] array;
         array=new int[n];
         for(int i =0; i<n; i++){
             array[i]=r.nextInt(99);  
         }
         return array;
    }
    
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         int[] array = new int[20];
         array=randomArray(20);
         printArray(array);
         
         System.out.println("Для вычисления корня введите номер элемента массива [0-19]:");
         int n = sc.nextInt();
         if ((n>=0)&&(n<=19)){
             double sqr = Math.sqrt(array[n]);
             System.out.println(sqr);
          }
         else{
             System.out.println("Некорректный ввод");
                  }
         
         System.out.println("Для вычисления среднего арифметического введите два номера элемента массива [0-19]:");
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         
         if ((n1>=0)&&(n1<=19)&&(n2>=0)&&(n2<=19)){
             double avg = (array[n1]+array[n2])/2;
             System.out.println(avg);
          }
         else{
             System.out.println("Некорректный ввод");
                  }
         
          }
}