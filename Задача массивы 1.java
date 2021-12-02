import java.util.Scanner;
//Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе
//выполнения программы.
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
         int[] array;
         array=new int[10];
         for(int i =0; i<10; i++){
             array[i]=sc.nextInt();
         }
         printArray(array);
          }
}